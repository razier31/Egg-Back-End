
import java.util.Scanner;

/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto.
 */

/**
 *
 * @author Ramiro
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una Frase");
        frase = leer.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("CORRECTO");            
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
