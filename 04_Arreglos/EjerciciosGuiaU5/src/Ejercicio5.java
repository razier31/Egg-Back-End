
import java.util.Scanner;

/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).

 */

/**
 *
 * @author Ramiro
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][]mat = new int [3][3];
        mat = cargarMat();
        System.out.println("Es Antisimetrica?\n"+esAntiSime(mat));
    }
    public static int[][] cargarMat(){
        Scanner leer = new Scanner(System.in);
        int[][]matriz = new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el Numero de la Posicion | "+i+" | "+j+" |");
                matriz[i][j]= leer.nextInt();
            }
        }
        return matriz;
    }
    public static boolean esAntiSime(int[][] matriz){
        boolean resp = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (-(matriz[i][j])!= matriz[j][i]) {
                    resp = false;
                    break;
                }
            }
        }
        return resp;
    }
}
