
import java.util.Scanner;

/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 */

/**
 *
 * @author Ramiro
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N;
        int M;
        int cant = 0;
        int edad;
        int promedio = 0;
        System.out.println("Ingrese la Cantidad de Familias");
        N = leer.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("Ingrese la cantidad de Hijos de la "+i+"° Familia");
            M = leer.nextInt();
            cant+= M;
            for (int j = 1; j <= M; j++) {
                System.out.println("Ingrese la edad del "+j+"° Hijo");
                edad = leer.nextInt();
                promedio+= edad;
            }
        }
        System.out.println("La media de edad de los hijos de todas las familas es de "+(promedio/cant));
    }
    
}
