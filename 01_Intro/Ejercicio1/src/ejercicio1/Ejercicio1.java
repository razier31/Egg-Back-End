/*
 Escribir un programa que pida dos números enteros por teclado y calcule 
la suma de los dos. El programa deberá después mostrar el resultado de la suma
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese el primer numero Entero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero Entero");
        num2 = leer.nextInt();
        System.out.println("La suma de los dos numeros es: "+(num1+num2));
    }
    
}
