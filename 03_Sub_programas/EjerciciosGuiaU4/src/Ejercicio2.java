
import java.util.Scanner;

/*
Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.

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
        Scanner leerTxt = new Scanner(System.in);
        String resp;
        do {
            censo();
            System.out.println("Desea Mostrar otra Persona");
            resp = leerTxt.nextLine();
        } while (resp.equalsIgnoreCase("si"));
        
    }
    public static void censo(){
        Scanner leerTxt = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        System.out.println("Ingrese el Nombre");
        nombre = leerTxt.nextLine();
        System.out.println("Ingrese la Edad");
        edad = leer.nextInt();
        if (edad>17) {
            System.out.println("Nombre: "+nombre+" es Mayor de Edad");
        }else{
            System.out.println("Nombre: "+nombre+" es Menor de Edad");
            }
                    
    }
}
