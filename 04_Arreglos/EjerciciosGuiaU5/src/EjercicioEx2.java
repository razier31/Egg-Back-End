
import java.util.Scanner;

/*
Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
*/

/**
 *
 * @author Ramiro
 */
public class EjercicioEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N;
        System.out.println("Ingrese el Tamaño de los Vectores");
        N = leer.nextInt();
        int[] vec1 = new int[N];
        int[] vec2 = new int[N];
        System.out.println("Cargando el Primer Vector");
        vec1 = cargarVec(N);
        System.out.println("Cargando el Segundo Vector");
        vec2 = cargarVec(N);
        System.out.println("Los Vectores son Iguales?\n"+sonIguales(vec1,vec2,N));
    }
    public static int[] cargarVec(int tam){
       Scanner leer = new Scanner(System.in);
       int[] vector = new int[tam];
       for (int i = 0; i < tam; i++) {
           System.out.println("Ingrese el "+(i+1)+"° Numero");
           vector[i]= leer.nextInt();
       }
       return vector;
    } 
    public static boolean sonIguales(int[] vector1,int[] vector2,int tam){
        boolean resp = true;
        for (int i = 0; i < tam; i++) {
            if (vector1[i]!=vector2[i]) {
                resp = false;
                break;
            }
        }
        return resp;
    }
}
