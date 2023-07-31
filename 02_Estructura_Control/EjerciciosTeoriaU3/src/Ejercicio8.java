
import java.util.Scanner;

/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

 */

/**
 *
 * @author Ramiro
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota;
        do {
            System.out.println("Ingrese una Nota entre 0 y 10");
            nota = leer.nextInt();
            if (nota<0||nota>10) {
                System.out.println("Nota Fuera de Rango");
            }
        } while (nota<0||nota>10);
        System.out.println("La nota ingresada es "+ nota);
        
    }
    
}
