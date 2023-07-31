/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alquiler;
import Entidades.Amotor;
import Entidades.Barco;
import Entidades.Velero;
import Entidades.Yate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class ServicioAlquiler {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Alquiler datosAlquiler;
    public Double precioAlquiler;
    
    public void nuevoAlquiler(){
        System.out.println("------SISTEMA DE ALQUILERES------");
        System.out.println("Ingrese el Nombre del Cliente");
        String nombre = leer.next();
        System.out.println("Ingrese el Dni del Cliente");
        Integer dni = leer.nextInt();
        Date fechaAl = new Date();
        System.out.println("La fecha Actual fue seteada como fecha de alquiler\n"+ fechaAl);
        System.out.println("Por cuantos dias desea realizar el alquiler?");
        int dias = leer.nextInt();
        Date fechaDev = sumarDiasFecha(fechaAl,dias);
        System.out.println("La fecha de devolucion fue seteada como\n"+ fechaDev);
        System.out.println("Ingrese el numero de la Posicion del Amarre");
        Integer amarre = leer.nextInt();
        Barco barco = elegirBarco();
        datosAlquiler = new Alquiler(nombre, dni, fechaAl, fechaDev, amarre, barco);
        precioAlquiler = precioAlquiler * dias;
    }
    
    private Barco elegirBarco(){
        String matricula;
        Double eslora;
        Integer anioFabricacion;
        Integer mastiles;
        Integer potencia;
        Integer camarotes;
        int opc;
        Barco eleccion = new Barco();
        
        do {
            System.out.println("------Seleccion de Barcos------");
        System.out.println("1 = Velero");
        System.out.println("2 = A Motor");
        System.out.println("3 = Yate de Lujo");
        System.out.println("Ingrese el Numero de Barco deseado");
        opc = leer.nextInt();
        switch (opc) {
            case 1:
                System.out.println("---VELERO---");
                System.out.println("Ingrese la Matricula del Velero");
                matricula = leer.next();
                System.out.println("Ingrese el Tamaño de la eslora en Mts");
                eslora = leer.nextDouble();
                System.out.println("Ingrese el año de fabricacion");
                anioFabricacion = leer.nextInt();
                System.out.println("Ingrese cantidad de mastiles");
                mastiles = leer.nextInt();
                eleccion = new Velero(mastiles, matricula, eslora, anioFabricacion);
                costoAlquiler(eslora, mastiles, 0, 0);
                break;
            case 2:
                System.out.println("---YATE DE LUJO---");
                System.out.println("Ingrese la Matricula del barco a Motor");
                matricula = leer.next();
                System.out.println("Ingrese el Tamaño de la eslora en Mts");
                eslora = leer.nextDouble();
                System.out.println("Ingrese el año de fabricacion");
                anioFabricacion = leer.nextInt();
                System.out.println("Ingrese la cantidad de Potencia");
                potencia = leer.nextInt();
                eleccion = new Amotor(potencia, matricula, eslora, anioFabricacion);
                costoAlquiler(eslora, 0, potencia, 0);
                break;
            case 3:
                System.out.println("---BARCO A MOTOR---");
                System.out.println("Ingrese la Matricula del barco a Motor");
                matricula = leer.next();
                System.out.println("Ingrese el Tamaño de la eslora en Mts");
                eslora = leer.nextDouble();
                System.out.println("Ingrese el año de fabricacion");
                anioFabricacion = leer.nextInt();
                System.out.println("Ingrese la cantidad de Potencia");
                potencia = leer.nextInt();
                System.out.println("Ingrese la cantidad de Camarotes");
                camarotes = leer.nextInt();
                eleccion = new Yate(camarotes, potencia, matricula, eslora, anioFabricacion);
                costoAlquiler(eslora, 0, potencia, camarotes);
                break;
            default:
                System.out.println("El numero Ingresado no es correcto");
        }
        } while (opc<1||opc>3);
        
        return eleccion;
    }
    
    private Date sumarDiasFecha(Date fecha, int dias){
	
        Calendar calendar = Calendar.getInstance();
	calendar.setTime(fecha); 
	calendar.add(Calendar.DAY_OF_YEAR, dias); 
	return calendar.getTime(); 
	
    }
    
    private void costoAlquiler(Double eslora, Integer mastiles, Integer potencia, Integer camarotes){
        precioAlquiler = 10*(eslora+mastiles+potencia+camarotes);
    }
    
}
