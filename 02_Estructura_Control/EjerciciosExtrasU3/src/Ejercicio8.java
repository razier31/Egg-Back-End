
import java.util.Scanner;

/*
Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
 */

/**
 *
 * @author Ramiro
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int conNum = 0;
        int conPar = 0;
        int conIm = 0;
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            if (num%5==0) {
                System.out.println("Multiplo de 5 detectado fin Programa");
                break;
            }
            if (num>0) {
                conNum++;
                if (num%2==0) {
                    conPar++;                    
                }else{
                    conIm++;
                }                
            }
        } while (num%5!=0);
        System.out.println("Cantidad de Numeros Totales Ingresados "+conNum);
        System.out.println("Cantidad de Numeros Totales Ingresados "+conPar);
        System.out.println("Cantidad de Numeros Totales Ingresados "+conIm);
    }
    
}
