
import java.util.Scanner;

/*
Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.

 */

/**
 *
 * @author Ramiro
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        int cont = 1;
        double num;
        double men;
        double may;
        double total = 0;
        do {
            System.out.println("Ingrese la cantidad de numeros que desea cargar");
            n = leer.nextInt();
        } while (n<1);
        System.out.println("Ingrese un numero");
        num = leer.nextDouble();
        men = num;
        may = num;
        total+= num;
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextDouble();
            total+= num;
            if (num>may) {
                may = num;
            }else if (num<men) {
                men = num;
            }
            cont++;
                    
        } while (cont<n);
        System.out.println("Numero Mayor: "+may);
        System.out.println("Numero Menor: "+men);
        System.out.println("Promedio "+(total/n));
    }
    
}
