
import java.util.Scanner;

/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **

 */

/**
 *
 * @author Ramiro
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        do {
            System.out.println("Ingrese un Numero entre 1 y 20");
            num1 = leer.nextInt();
            if (num1<0||num1>10) {
                System.out.println("Numero Fuera de Rango");
            }
        } while (num1<1||num1>20);
        do {
            System.out.println("Ingrese un Numero entre 1 y 20");
            num2 = leer.nextInt();
            if (num2<0||num2>10) {
                System.out.println("Numero Fuera de Rango");
            }
        } while (num2<1||num2>20);
        do {
            System.out.println("Ingrese un Numero entre 1 y 20");
            num3 = leer.nextInt();
            if (num3<0||num3>10) {
                System.out.println("Numero Fuera de Rango");
            }
        } while (num3<1||num3>20);
        do {
            System.out.println("Ingrese un Numero entre 1 y 20");
            num4 = leer.nextInt();
            if (num4<0||num4>10) {
                System.out.println("Numero Fuera de Rango");
            }
        } while (num4<1||num4>20);
        System.out.print(num1+" ");
        for (int i = 0; i < num1; i++) {
            System.out.print("*");         
        }
        System.out.println("");
        System.out.print(num2+" ");
        for (int i = 0; i < num2; i++) {
            System.out.print("*");         
        }
        System.out.println("");
        System.out.print(num3+" ");
        for (int i = 0; i < num3; i++) {
            System.out.print("*");         
        }
        System.out.println("");
        System.out.print(num4+" ");
        for (int i = 0; i < num4; i++) {
            System.out.print("*");         
        }
        System.out.println("");
    }
    
}
