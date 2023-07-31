
import java.util.Scanner;

/*
Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.

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
        int opc;
        double num1;
        double num2;
        System.out.println("Ingrese el primer numero");
        num1= leer.nextDouble();
        System.out.println("Ingrese el Segundo numero");
        num2= leer.nextDouble();
        System.out.println("OPERACIONES");
        System.out.println("1 - SUMAR");
        System.out.println("2 - RESTAR");
        System.out.println("3 - MULTIPLICAR");
        System.out.println("4 - DIVIDIR");
        System.out.println("Ingrese una opcion...");
        opc = leer.nextInt();
        switch (opc) {
            case 1:
                System.out.println("La suma de los Numeros es "+sumar(num1,num2));
                break;
            case 2:
                System.out.println("La resta de los Numeros es "+restar(num1,num2));
                break;
            case 3:
                System.out.println("La multiplicacion de los Numeros es "+multiplicar(num1,num2));
                break;
            case 4:
                System.out.println("La division de los Numeros es "+dividir(num1,num2));
                break;
            default:
                System.out.println("La opcion ingresada es Incorrecta");
        }
    }
    public static double sumar(double numA, double numB){
        double total;
        total = numA + numB;
        return total;
    }
    public static double restar(double numA, double numB){
        double total;
        total = numA - numB;
        return total;
    }
    public static double multiplicar(double numA, double numB){
        double total;
        total = numA * numB;
        return total;
    }
    public static double dividir(double numA, double numB){
        double total;
        total = numA / numB;
        return total;
    }
    
}
