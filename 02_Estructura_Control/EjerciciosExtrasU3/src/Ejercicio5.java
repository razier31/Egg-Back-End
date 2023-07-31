
import java.util.Scanner;

/*
Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
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
        Scanner leertxt = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        char clase;
        float tratamiento;
        System.out.println("Ingrese la Clase de Socio A, B o C");
        clase = leertxt.next().charAt(0);
        System.out.println("Ingrese el Monto del Tratamiento");
        tratamiento = leer.nextFloat();
        switch (clase) {
            case 'A':
                System.out.println("El Monto Total a Abonar es de "+(tratamiento-tratamiento*0.5));
                break;
            case 'B':
                System.out.println("El Monto Total a Abonar es de "+(tratamiento-tratamiento*0.35));
                break;
            case 'C':
                System.out.println("El Monto Total a Abonar es de "+tratamiento);
                break;
            default:
                System.out.println("La clase Introducida No es correcta");
        }
    }
    
}
