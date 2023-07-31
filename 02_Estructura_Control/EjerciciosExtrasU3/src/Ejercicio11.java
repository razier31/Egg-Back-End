
import java.util.Scanner;

/*
Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.
*/

/**
 *
 * @author Ramiro
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int cont = 0;
        System.out.println("Ingrese un numero para saber la cantidad de Digitos");
        num = leer.nextInt();
        while (num!=0) {
            num/= 10;
            cont++;
        }
        System.out.println(cont);
    }
    
}
