
import java.util.Scanner;

/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:

 */

/**
 *
 * @author Ramiro
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N;
        System.out.println("Ingrese el Tamaño del Cuadro ");
        N = leer.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i==1||i==N||j==1||j==N) {
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}
