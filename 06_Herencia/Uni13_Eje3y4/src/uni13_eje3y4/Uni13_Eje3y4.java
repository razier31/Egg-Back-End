/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
 */
package uni13_eje3y4;

import Entidades.DivisionNumero;
import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class Uni13_Eje3y4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DivisionNumero operar = new DivisionNumero();
        int num1, num2;
        String numc1, numc2;
        Scanner leer = new Scanner(System.in);
        
        try {
            System.out.println("Ingrese el primer numero");
            numc1 = leer.next();
            System.out.println("Ingrese el segundo numero");
            numc2 = leer.next();
            num1 = Integer.parseInt(numc1);
            num2 = Integer.parseInt(numc2);
            operar.dividir(num1, num2);
        } catch (ArithmeticException a) {
              System.out.println("No es Posible la division por cero");
        } catch (NumberFormatException b) {
              System.out.println("No es Posible dividir letras");
        } catch (Exception c) {
              System.out.println("Error de Sitema");
        }
    }
    
}
