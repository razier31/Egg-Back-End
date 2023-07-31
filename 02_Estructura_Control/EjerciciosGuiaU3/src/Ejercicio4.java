
import java.util.Scanner;

/*
Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. 
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
        String frase;
        System.out.println("Ingrese una Frase o palabra");
        frase = leer.nextLine();
        if (frase.substring(0,1).equalsIgnoreCase("A")) {
            System.out.println("CORRECTO");             
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
