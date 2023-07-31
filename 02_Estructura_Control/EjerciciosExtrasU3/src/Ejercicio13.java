
import java.util.Scanner;

/*
Crear un programa que dibuje una escalera de números, donde cada
línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se
ingresa el número 3:
1
12
123
*/

/**
 *
 * @author Ramiro
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int altura;
        int cont = 0;
        System.out.println("Ingrese la Altura de la Ecalera");
        altura = leer.nextInt();
        do {
            cont++;
            for (int i = 1; i <= cont; i++) {
                System.out.print(i+" ");
            }
            System.out.println("");
        } while (cont!=altura);
        
    }
    
}
