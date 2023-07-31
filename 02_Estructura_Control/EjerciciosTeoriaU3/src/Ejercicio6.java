
import java.util.Scanner;

/*
 Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
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
        int num1;
        int num2;
        System.out.println("Por favor Ingrese el primer numero entero");
        num1 = leer.nextInt();
        System.out.println("Por favor Ingrese el Segundo numero entero");
        num2 = leer.nextInt();
        if (num1>25&&num2>25) {
            System.out.println("Los Dos Numeros Son Mayores de 25");
        }else if (num2>25) {
            System.out.println("El numero "+num2+" es Mayor a 25");
        }else if (num1>25) {
            System.out.println("El numero "+num1+" es Mayor a 25");
        }else   {
            System.out.println("Ningun numero es mas Grande que 25");
        }
        }
    }
    

