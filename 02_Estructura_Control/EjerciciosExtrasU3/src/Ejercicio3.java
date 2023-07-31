
import java.util.Scanner;

/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
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
        String letra;
        System.out.println("Ingrese una Letra");
        letra = leer.nextLine();
        if (letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")) {
            System.out.println("La Letra ingresada es una Vocal");
        }else{
            System.out.println("La Letra ingresada No es una Vocal");
        }   
    }
    
}
