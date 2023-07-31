
import java.util.Scanner;

/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
a
e
i
o
u
@
#
$
%
*

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */

/**
 *
 * @author Ramiro
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una Frase");
        frase = leer.nextLine();
        System.out.println(convertir(frase));
        
    
    }
    public static String convertir(String cadena){
        int cont = 0;
        String letra;
        String cadena2 = "" ;
        while ((!".".equals(cadena.substring(cont, (cont+1))))) {
            letra = cadena.substring(cont, (cont+1));
            switch (letra) {
                case "a":
                    cadena2=cadena2.concat("@");
                    break;
                    case "e":
                    cadena2=cadena2.concat("#");
                    break;
                    case "i":
                    cadena2=cadena2.concat("$");
                    break;
                    case "o":
                    cadena2=cadena2.concat("%");
                    break;
                    case "u":
                    cadena2=cadena2.concat("*");
                    break;
                default:
                    cadena2=cadena2.concat(letra);
            }
            cont++;
        }
        return cadena2;
    }
}
