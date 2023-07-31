/*
mplemente la clase Persona en el paquete entidades. Una persona tiene
un nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
constructor parametrizado, get y set. Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada.
*/
package u9ejercicio5;

import Entidad.Persona;
import Servicio.PersonaService;

/**
 *
 * @author Ramiro
 */
public class U9Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService serv =new PersonaService();
        Persona user01 = serv.crearPersona();
        serv.mostrarPersona(user01);
        System.out.println("Es menor de edad? "+serv.menorQue(user01));
    }
    
}
