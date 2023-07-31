/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vacío, con parámetros, getters y
setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d)Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.
*/
package u8ejercicio1;

import Entidad.CuentaBancaria;
import Servicio.CuentaBancariaService;
import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class U8Ejercicio1 {

    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CuentaBancariaService servCta = new CuentaBancariaService();
        CuentaBancaria cta01 = servCta.crearCta();
        System.out.println("Cuanto desea Ingresar en su Cuenta");
        servCta.ingresar(cta01, leer.nextDouble());
        System.out.println("Cuanto desea Extraer de su Cuenta");
        servCta.retirar(cta01, leer.nextDouble());
        System.out.println("EXTRACCION RAPIDA\nMaximo un 20% de su cuenta");
        servCta.extraccionRapida(cta01, leer.nextDouble());
        servCta.consultarSaldo(cta01);
        servCta.consultarDatos(cta01);
    }
    
}