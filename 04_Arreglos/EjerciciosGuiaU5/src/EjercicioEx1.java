
import java.util.Scanner;

/*
Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
*/

/**
 *
 * @author Ramiro
 */
public class EjercicioEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N;
        System.out.println("Ingrese el Tamaño del Vector");
        N = leer.nextInt();
        double[] vec = new double[N];
        vec = cargarVec(N);
        sumarVec(vec,N);
    }
   public static double[] cargarVec(int tam){
       Scanner leer = new Scanner(System.in);
       double[] vector = new double[tam];
       for (int i = 0; i < tam; i++) {
           System.out.println("Ingrese el "+(i+1)+"° Numero");
           vector[i]= leer.nextDouble();
       }
       return vector;
   } 
   public static void sumarVec(double[] vector, int tam){
       double suma = 0;
       for (int i = 0; i < tam; i++) {
           suma += vector[i];
       }
       System.out.println("La suma total del Vector es de "+suma);
   }
}
