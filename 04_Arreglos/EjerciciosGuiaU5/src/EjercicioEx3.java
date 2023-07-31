
import java.util.Scanner;

/*
Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
*/

/**
 *
 * @author Ramiro
 */
public class EjercicioEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N;
        System.out.println("Ingrese el tamaño del vector que desea llenar");
        N = leer.nextInt();
        int[] vec = new int[N];
        fillVecRand(vec,N);
        mostrarVec(vec,N);
    }
    public static int[] fillVecRand(int[] vector, int tam){
        for (int i = 0; i < tam; i++) {
            vector[i]=(int)(Math.random()*20+1);
        }
        return vector;
    }
    public static void mostrarVec(int[] vector, int tam){
        for (int i = 0; i < tam; i++) {
            System.out.print(vector[i]+" | ");
        }
    }
}
