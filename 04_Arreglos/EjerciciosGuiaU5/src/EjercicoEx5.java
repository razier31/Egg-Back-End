
import java.util.Scanner;

/*
Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
*/

/**
 *
 * @author Ramiro
 */
public class EjercicoEx5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N;
        int M;
        System.out.println("Ingrese el Valor para N (Filas)");
        N = leer.nextInt();
        System.out.println("Ingrese el Valor para M (Columnas)");
        M = leer.nextInt();
        int [][] mat = new int [N][M];
        fillMatRand(mat, N ,M);
        sumaMat(mat, N ,M);
    }
    public static int[][] fillMatRand(int[][] matriz, int fila, int columna){
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriz[i][j]=(int)(Math.random()*20+1);
            }
        }
        return matriz;
    }
    public static void sumaMat(int[][] matriz, int fila, int columna){
        int suma=0;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                suma+= matriz[i][j];
            }
        }
        System.out.println("La Suma Total de la Matriz es: "+suma);
    }
}
