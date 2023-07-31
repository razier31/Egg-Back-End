

import java.util.Scanner;

/*
Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
*/

/**
 *
 * @author Ramiro
 */
public class Ejercicio3 {

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
        contDig(vecInt,N);
    }
    public static void contDig(int[] vector, int tam){
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        int dig;
        int num;
        for (int i = 0; i < tam; i++) {
            dig = 0;
            num = vector[i];
            while (num!=0) {
                num /= 10;
                dig++;
            }
            switch (dig) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
                default:
                    throw new AssertionError();
            }
        }
        System.out.println("La cantidad de numeros de 1 Digito es: "+cont1);
        System.out.println("La cantidad de numeros de 2 Digitos es: "+cont2);
        System.out.println("La cantidad de numeros de 3 Digitos es: "+cont3);
        System.out.println("La cantidad de numeros de 4 Digitos es: "+cont4);
        System.out.println("La cantidad de numeros de 5 Digitos es: "+cont5);
    }
    public static int[] fillVecRand(int tam){
        int [] vector = new int[tam];
        for (int i = 0; i < tam; i++) {
            vector[i] =(int)(Math.random()*9999+1);
        }
        return vector;
    }
}
