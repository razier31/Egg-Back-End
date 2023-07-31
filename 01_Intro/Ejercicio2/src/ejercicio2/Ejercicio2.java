/*
Escribir un programa que pida tu nombre, lo guarde en una variable y 
lo muestre por pantalla.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Por favor ingrese un nombre");
        nombre = leer.next();
        System.out.println("El nombre que Ingreso es: "+ nombre);
    }
    
}
