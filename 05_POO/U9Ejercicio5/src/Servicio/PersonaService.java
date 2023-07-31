/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class PersonaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
//Método crearPersona que pida al usuario Nombre y fecha de
//nacimiento de la persona a crear. Retornar el objeto Persona creado.
    public Persona crearPersona(){
        int anio, mes, dia;
        String nombre;
        System.out.println("Ingrese el Nombre de la Persona");
        nombre = leer.next();
        System.out.println("Ingrese su dia de Nacimiento");
        dia = leer.nextInt();
        System.out.println("Ingrese el Mes");
        mes = leer.nextInt();
        System.out.println("Ingrese el Año");
        anio = leer.nextInt();
        Date fecha = new Date(anio, mes, dia);
        return new Persona(nombre, fecha);                
    }
    
    public Date fechaActual(){
        return new Date();
    }
//Método calcularEdad que calcule la edad del usuario utilizando el
//atributo de fecha de nacimiento y la fecha actual.
    public int calcularEdad(Persona per1){
        return fechaActual().getYear()-per1.getFechaNacimiento().getYear();
    }
//Método menorQue recibe como parámetro una Persona y una edad.
//Retorna true si la persona es menor que la edad consultada o false
//en caso contrario.
    public Boolean menorQue(Persona per1){
        if (calcularEdad(per1)<18) {
            return true;
        }else{
            return false;
        }
    }
//Método mostrarPersona que muestra la información de la persona
//deseada.
    public void mostrarPersona(Persona per1){
        System.out.println("Nombre: "+per1.getNombre());
        System.out.println("Edad: "+calcularEdad(per1));
    }
}
