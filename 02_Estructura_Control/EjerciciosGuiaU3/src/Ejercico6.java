
import java.util.Scanner;

/*
Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.

 */

/**
 *
 * @author Ramiro
 */
public class Ejercico6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leertxt = new Scanner(System.in);
        int num1;
        int num2;
        int opc;
        String enter;
        String respuesta = "n";
        do {
            System.out.println("Ingrese Dos Numeros positivos");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
        } while (num1<1||num2<1);
        
        do {
            System.out.println("MENU");
            System.out.println("1 - SUMAR");
            System.out.println("2 - RESTAR");
            System.out.println("3 - MULTIPLICAR");
            System.out.println("4 - DIVIDIR");
            System.out.println("5 - SALIR");
            System.out.println("-----------------");
            System.out.println("");
            System.out.println("Ingrese Una Opcion");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println(num1+" + "+num2+" = "+(num1+num2));
                    System.out.println("Presione enter para Continuar...");
                    enter = leertxt.nextLine();
                    break;
                case 2:
                    System.out.println(num1+" - "+num2+" = "+(num1-num2));
                    System.out.println("Presione enter para Continuar...");
                    enter = leertxt.nextLine();
                    break;
                case 3:
                    System.out.println(num1+" x "+num2+" = "+(num1*num2));
                    System.out.println("Presione enter para Continuar...");
                    enter = leertxt.nextLine();
                    break;
                case 4:
                    System.out.println(num1+" / "+num2+" = "+(num1/num2));
                    System.out.println("Presione enter para Continuar...");
                    enter = leertxt.nextLine();
                    break;
                case 5:
                    System.out.println("Realmente desea Salir s o n?");
                    respuesta = leertxt.nextLine();
                    break;
                default:
                    System.out.println("La Opcion Ingresada es Incorrecta");
            }
        } while (respuesta.equals("n"));
        
    }
    
}
