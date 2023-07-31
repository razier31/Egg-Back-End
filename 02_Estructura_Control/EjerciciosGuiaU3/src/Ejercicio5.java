
import java.util.Scanner;

/*
Escriba un programa en el cual se ingrese un valor limite positivo, y a
continuación solicite numeros al usuario hasta que la suma de los
numeros introducidos supere el limite inicial.
 */

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
        double limite;
        double num;
        double total = 0;
        do {
            System.out.println("Ingrese un Numero positivo para el Limite");
            limite = leer.nextDouble();
        } while (limite<1);
        
        do {
            System.out.println("Ingrese un Numero");
            num = leer.nextDouble();
            total+= num;
        } while (total<limite);
        System.out.println("La suma Total de los numeros Ingresados es "+total);
    }
    
}
