
import java.util.Scanner;

/*
Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 */

/**
 *
 * @author Ramiro
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        int contC = 0;
        int contI = 0;
        do {
            System.out.println("Ingrese una Cadena");
            cadena = leer.nextLine();
            if (cadena.length()==5) {
                if (cadena.substring(0,1).equals("X")&&cadena.substring(4,5).equals("O")) {
                    System.out.println("Cadena Recibida");
                    contC++;
                }else if ("&&&&&".equals(cadena)) {
                    System.out.println("Fin de Cadenas Recibido");
                }else{
                System.out.println("FORMATO INCORRECTO caracter de inicio o fin erroneo");
                contI++;   
                }
            }else{
                System.out.println("FORMATO INCORRECTO La cadena Tiene menos de 5 Caracteres");
                contI++;
            }
        } while (!"&&&&&".equals(cadena));
        System.out.println("Ingresos Correctos "+contC);
        System.out.println("Ingresos Incorrectos "+contI);
        
    }
    
}
