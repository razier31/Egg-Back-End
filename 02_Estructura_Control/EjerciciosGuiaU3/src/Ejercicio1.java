
import java.util.Scanner;

/*
Crear un programa que dado un número determine si es par o impar
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
        double num;
        System.out.println("Ingrese un Numero");
        num = leer.nextDouble();
        if (num%2==0) {
            System.out.println("El numero es Par");            
        }else{
            System.out.println("El numero es Impar");
        }   
    }
    
}
