/*
Escribir un programa que lea un número entero por teclado y muestre por 
pantalla el doble, el triple y la raíz cuadrada de ese número.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero Entero");
        num = leer.nextInt();
        System.out.println("El doble del Numero es: "+(num*2));
        System.out.println("El Triple del Numero es: "+(num*3));
        System.out.println("La Raiz cuadrada del Numero es: "+(Math.sqrt(num)));
    }
    
}
