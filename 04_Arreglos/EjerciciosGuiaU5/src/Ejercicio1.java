/*
Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
*/

/**
 *
 * @author Ramiro
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vecInt= new int[100];
        vecInt = cargar100Int();
        mostrarDes(vecInt);
    }
    public static int[] cargar100Int(){
        int[] vector= new int[100];
        for (int i = 1; i <= 100; i++) {
            vector[i-1]= i;
        }
        return vector;
    }
    public static void mostrarDes(int[] vector){
        for (int i = 99; i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }
}
