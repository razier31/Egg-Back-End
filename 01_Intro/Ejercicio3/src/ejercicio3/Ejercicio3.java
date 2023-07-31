/*
Escribir un programa que pida una frase y la muestre toda 
en mayúsculas y después toda en minúsculas. 
 */
package ejercicio3;

import java.util.Scanner;


/**
 *
 * @author Ramiro
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Por favor ingrese una frase");
        frase = leer.nextLine();
        
        System.out.println("La Frase en Mayusculas es: "+frase.toUpperCase());
        System.out.println("La Frase en Minusculas es: "+frase.toLowerCase());
    }
    
}
