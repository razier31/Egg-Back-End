/*
4. Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);
b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date.
c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).

 */
package u9ejercicio4;

import Servicio.FechaService;
import java.util.Date;

/**
 *
 * @author Ramiro
 */
public class U9Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FechaService serv = new FechaService();
       Date nacimiento = serv.fechaNacimiento();
       Date fechaAct = serv.fechaActual();
       int edad = serv.diferencia(nacimiento, fechaAct);
       
        System.out.println(nacimiento);
        System.out.println(fechaAct);
        System.out.println(edad);
    }
    
}
