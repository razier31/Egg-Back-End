/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class FechaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

//Método fechaNacimiento que pregunte al usuario día, mes y año de
//su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
//El método debe retornar el objeto Date.

    public Date fechaNacimiento(){
        int anio, mes, dia;
        System.out.println("Ingrese su dia de Nacimiento");
        dia = leer.nextInt();
        System.out.println("Ingrese el Mes");
        mes = leer.nextInt();
        System.out.println("Ingrese el Año");
        anio = leer.nextInt();
        return new Date(anio,mes-1,dia);
    }
    
//Método fechaActual que cree un objeto fecha con el día actual. Para
//esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
//fechaActual = new Date();
//El método debe retornar el objeto Date.
    
    public Date fechaActual(){
        return new Date();
    }
    
//Método diferencia que reciba las dos fechas por parámetro y retorna
//la diferencia de años entre una y otra (edad del usuario).
    
    public int diferencia(Date fecha1, Date fecha2){
        return fecha2.getYear()-fecha1.getYear();
    }
}
