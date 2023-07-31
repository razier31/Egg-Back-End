
import java.util.Scanner;

/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.
 */

/**
 *
 * @author Ramiro
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num1;
        double num2;
        System.out.println("Ingrese el primer numero");
        num1 = leer.nextDouble();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextDouble();
        esMultiplo(num1,num2);
    }
    public static void esMultiplo(double num1, double num2){
        if (num2%num1==0) {
            System.out.println("El numero "+num1+" es Multiplo de "+num2);
        }else{
            System.out.println("El numero "+num1+" No es Multiplo de "+num2);
        }
    }
}
