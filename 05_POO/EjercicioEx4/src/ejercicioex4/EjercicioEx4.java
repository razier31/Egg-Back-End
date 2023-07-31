/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 */
package ejercicioex4;

import Entidad.Cuenta;

/**
 *
 * @author Ramiro
 */
public class EjercicioEx4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cta1 = new Cuenta("Lopez Ramiro",150000);
        cta1.retirar_dinero(160000);
        cta1.retirar_dinero(75000);
        System.out.println(cta1);
    }
    
}
