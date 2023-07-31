
import java.util.Scanner;

/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.

 */

/**
 *
 * @author Ramiro
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][]cuadrado = new int [3][3];
        cuadrado = cargarMat();
        System.out.println("La Matriz es un Cuadrado magico?\n"+esMagico(cuadrado));
    }
    public static int[][] cargarMat(){
        Scanner leer = new Scanner(System.in);
        int[][]matriz = new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese un numero entre 1 y 9 de la Posicion | "+i+" | "+j+" |");
                    matriz[i][j]= leer.nextInt();
                    if (matriz[i][j]<1||matriz[i][j]>9) {
                        System.out.println("El numero Ingresado no es correcto");
                    }
                } while (matriz[i][j]<1||matriz[i][j]>9);
            }
        }
        return matriz;
    }
    public static boolean esMagico(int[][] matriz){
        boolean bool = true;
        int suma = 0;
        int aux;
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            suma += matriz[0][i];
        }
        for (int i = 1; i < 3; i++) {
            aux = 0;
            for (int j = 0; j < 3; j++) {
                aux+= matriz[i][j];
            }
            if (aux!=suma) {
                bool = false;
                break;
            }
        }
        aux = 0;
        for (int i = 0; i < 3; i++) {
            aux+= matriz[i][i];
        }
        if (aux!=suma) {
                bool = false;
        }
        aux = 0;
        for (int i = 2; i >= 0; i--) {
            aux+= matriz[i][cont];
            cont++;
        }
        if (aux!=suma) {
                bool = false;
        }
        return bool;
    }
}
