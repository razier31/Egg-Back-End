/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5)
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float centi;
        float fahren;
        System.out.println("Ingrese los Grados en Celsius");
        centi = leer.nextInt();
        fahren = 32 + (9 * centi / 5);
        System.out.println(centi+" Centigrados es Equivalente a: "+fahren+" Fahrenheit");
    }
    
}
