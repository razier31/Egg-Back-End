
import java.util.Scanner;

/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
compañeros de equipo

 */

/**
 *
 * @author Ramiro
 */
public class Ejercicio13y14Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String [] compas = new String[9];
        for (int i = 1; i <= 9; i++) {
            System.out.println("Ingrese el "+i+"° nombre del compañero");
            compas[i-1] = leer.nextLine();
        }
        System.out.println("Los compañeos son:");
        for (int i = 0; i < 9; i++) {
            System.out.println(compas[i]);
        }
    }
    
}
