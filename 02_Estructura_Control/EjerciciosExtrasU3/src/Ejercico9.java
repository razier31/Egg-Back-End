
import java.util.Scanner;

/*
Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
*/

/**
 *
 * @author Ramiro
 */
public class Ejercico9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cociente = 0;
        int resto;
        int num1;
        int num2;
        System.out.println("Ingrese el dividendo");
        num1 = leer.nextInt();
        resto = num1;
        System.out.println("Ingrese el divisor");
        num2 = leer.nextInt();
        while (resto>=num2) {
            resto-=num2;
            cociente++;            
        }
        System.out.println("El cociente de la division es de: "+cociente);
        System.out.println("El resto de la division es de: "+resto);
    }
    
}
