
import java.util.Scanner;

/*
Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.

 */

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
        double num;
        System.out.println("Ingrese un Numero");
        num = leer.nextDouble();
        System.out.println("El numero "+num+" es Primo? "+esPrimo(num));
    }
    public static boolean esPrimo(double num){
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                primo = false;
                break;
            }
        }
        return primo;
    }
}
