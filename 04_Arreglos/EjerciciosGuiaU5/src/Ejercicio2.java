
import java.util.Scanner;

/*
Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
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
        int N;
        System.out.println("Ingrese el Tamaño del Vector que desea llenar");
        N = leer.nextInt();
        int[] vecInt = new int[N];
        vecInt = fillVecRand(N);
        buscNum(vecInt, N);
    }
    public static int[] fillVecRand(int tam){
        int [] vector = new int[tam];
        for (int i = 0; i < tam; i++) {
            vector[i] =(int)(Math.random()*20+1);
        }
        return vector;
    }
    public static void buscNum(int[] vector,int tam){
        Scanner leer = new Scanner(System.in);
        int num;
        int cont = 0;
        System.out.println("Ingrese el numero que desea buscar entre 1 y 20");
        num = leer.nextInt();
        for (int i = 0; i < tam; i++) {
            if (num==vector[i]&&cont<1) {
                System.out.println("El numero "+num+" se Encuentra en la posicion: "+i);
                cont++;
            }else if(num==vector[i]){
                cont++;
            }
        }
        if (cont>=2) {
            System.out.println("El numero se encuentra repetido en otrs posiciones");
        }
    }
}
