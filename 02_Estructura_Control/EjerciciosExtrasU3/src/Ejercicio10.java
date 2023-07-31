
import java.util.Scanner;

/*
Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.

 */

/**
 *
 * @author Ramiro
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double aleatorio;
        double num;
        aleatorio = (Math.random()*10)*(Math.random()*10);
        aleatorio = Math.round(aleatorio);
        //System.out.println(aleatorio);
        do {
            System.out.println("Ingrese Un numero");
            num = leer.nextDouble();
            if (num<aleatorio) {
                System.out.println("El numero secreto es mas Grande");
            }else if (num>aleatorio) {
                System.out.println("El numero secreto es mas Chico");
            }else{
                System.out.println("El numero secreto es CORRECTO");
            }
        } while (num!=aleatorio);
        
    }
    
}
