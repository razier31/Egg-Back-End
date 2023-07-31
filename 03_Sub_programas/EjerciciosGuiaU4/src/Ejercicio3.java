
import java.util.Scanner;

/*
Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €

 */

/**
 *
 * @author Ramiro
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leerTxt = new Scanner(System.in);
        float monto;
        String moneda;
        System.out.println("Ingrese el Monto");
        monto = leer.nextFloat();
        System.out.println("Ingrese la Moneda en que desea convertir\nLibra\nDolar\nYen");
        moneda = leerTxt.nextLine();
        cambio(monto,moneda);
    }
    public static void cambio(float num, String moneda){
        moneda = moneda.toLowerCase();
        switch (moneda) {
            case "libra":
                System.out.println("La conversion en Libras es de "+(num*0.86));
                break;
            case "dolar":
                System.out.println("La conversion en Dolares es de "+(num*1.28611));
                break;
            case "yen":
                System.out.println("La conversion en Yenes es de "+(num*129.852));
                break;
            default:
                System.out.println("La moneda Ingresada es incorrecta");
        }
    }
}
