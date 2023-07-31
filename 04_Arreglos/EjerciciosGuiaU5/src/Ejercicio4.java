/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).

 */

/**
 *
 * @author Ramiro
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] mat = new int[4][4];
        mat = fillMatRand();
        System.out.println("Matriz Normal");
        mostrar(mat);
        System.out.println("Matriz Traspuesta");
        mostrarTras(mat);
    }
    public static int[][] fillMatRand(){
        int [][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] =(int)(Math.random()*10+1);
            }
        }
        return matriz;
    }
    public static void mostrarTras(int[][] matriz){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i]+" | ");
            }
            System.out.println("");
        }
    }
    public static void mostrar(int[][] matriz){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+" | ");
            }
            System.out.println("");
        }
    }
}
