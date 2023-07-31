
import java.util.Scanner;

/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
*/

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
        int minutos;
        int horas;
        int dias;
        System.out.println("Ingrese la cantidad de Minutos");
        minutos = leer.nextInt();
        horas = minutos / 60;
        dias = horas / 24;
        System.out.println("El equivalente es "+ dias +" Dias y "+ (horas - dias * 24) +" Horas");
    }
    
}
