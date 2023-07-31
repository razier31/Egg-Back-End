
import java.util.Scanner;

/*
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */

/**
 *
 * @author Ramiro
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N;
        float altura;
        float promT = 0;
        float prom16= 0;
        int cont = 0;
        System.out.println("Ingrese la cantidad de Personas");
        N = leer.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("Ingrese la Altura de la "+i+"° Persona");
            altura = leer.nextFloat();
            promT += altura;
            if (altura<1.6) {
                cont++;
                prom16 += altura;
            }
        }
        System.out.println("El Total del Promedio de todas Las Personas es de "+(promT/N));
        System.out.println("El Total del Promedio de Las Personas con altura inferior a 1,60 es de "+(prom16/cont));
    }
    
}
