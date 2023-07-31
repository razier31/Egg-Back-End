
import java.util.Scanner;

/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
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
        int num;
        do {
            System.out.println("Por favor Ingrese un numero entre el 1 al 10 para conocer su equivalente en Romano");
            num = leer.nextInt();
        } while (num<1||num>10);
        switch (num) {
            case 1:
                System.out.println("El Equivalente a "+ num +" en Romano es: I");
                break;
            case 2:
                System.out.println("El Equivalente a "+ num +" en Romano es: II");
                break;    
            case 3:
                System.out.println("El Equivalente a "+ num +" en Romano es: III");
                break;   
            case 4:
                System.out.println("El Equivalente a "+ num +" en Romano es: IV");
                break;
            case 5:
                System.out.println("El Equivalente a "+ num +" en Romano es: V");
                break;       
            case 6:
                System.out.println("El Equivalente a "+ num +" en Romano es: VI");
                break;
            case 7:
                System.out.println("El Equivalente a "+ num +" en Romano es: VII");
                break;
            case 8:
                System.out.println("El Equivalente a "+ num +" en Romano es: VIII");
                break;       
            case 9:
                System.out.println("El Equivalente a "+ num +" en Romano es: IX");
                break;
            case 10:
                System.out.println("El Equivalente a "+ num +" en Romano es: X");
                break;   
        }
        
    }
    
}
