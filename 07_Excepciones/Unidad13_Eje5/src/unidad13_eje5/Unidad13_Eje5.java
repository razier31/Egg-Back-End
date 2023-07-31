/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.

 */
package unidad13_eje5;

import Excepciones.FueraRango;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class Unidad13_Eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeroSecreto;
        int intentos = 0;
        int numero = 0;
        
        numeroSecreto =(int)(Math.random()*500+1);
        System.out.println(numeroSecreto);
        do {
            try {
                intentos+=1;
                System.out.println("Ingrese un numero");
                numero = leer.nextInt();
                control(numero);
                if (numero<numeroSecreto) {
                    System.out.println("El mumero ingresado es Menor al numero Secreto");
                }else if(numero>numeroSecreto){
                    System.out.println("El mumero ingresado es Mayor al numero Secreto");
                }
            }catch (FueraRango a) {
                    System.out.println(a.getMessage());
            }catch (InputMismatchException b) {
                    System.out.println("No se Ingreso un numero");
                    leer.next();
            }
            finally{
                System.out.println("-----------------------------");
            }
        } while (numero!=numeroSecreto);
        
        System.out.println("Has Adivinado el numero secreto en "+intentos+" intentos");
    }
    public static void control(int num) throws FueraRango{
            if (num<1||num>500) {
                throw new FueraRango("El numero se encuentra fuera de Rango ingrese un numero entre 1 y 500");
            }
        }
    
}
