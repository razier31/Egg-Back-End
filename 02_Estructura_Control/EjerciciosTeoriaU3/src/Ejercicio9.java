
import java.util.Scanner;

/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break
 */

/**
 *
 * @author Ramiro
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        float num;
        float sumaTotal = 0;
        do {
            cont++;
            System.out.println("Ingrese el "+ cont+"° numero");
            num = leer.nextFloat();
            if (num==0) {
                System.out.println("Se capturo el numero 0");
                break;                
            }else if (num>0) {
                sumaTotal+=num;
            }
        } while (cont<20);
        System.out.println("La suma Total Ingresada de los numeros Positivos es de "+ sumaTotal);
        
    }
    
}
