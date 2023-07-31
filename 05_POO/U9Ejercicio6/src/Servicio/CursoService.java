/*
 d) Método cargarAlumnos(): este método le permitirá al usuario ingresar
los alumnos que asisten a las clases. Nosotros nos encargaremos de
almacenar esta información en un arreglo e iterar con un bucle,
solicitando en cada repetición que se ingrese el nombre de cada
alumno.
e) Método crearCurso(): el método crear curso, le pide los valores de
los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Curso. En este método invocamos al
método cargarAlumnos() para asignarle valor al atributo alumnos
f) Método calcularGananciaSemanal(): este método se encarga de
calcular la ganancia en una semana por curso. Para ello, se deben
multiplicar la cantidad de horas por día, el precio por hora, la
cantidad de alumnos y la cantidad de días a la semana que se repite
el encuentro.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class CursoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public String[] cargarAlumnos(){
        String[] alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del "+(i+1)+"° Alumno");
            alumnos[i] = leer.next();
        }
        return alumnos;
    }
    public Curso crearCurso(){
        String nombreCurso, turno;
        int cantidadHorasXDia, cantidadDiasXSemana;
        double precioXHora;
        System.out.println("Ingrese el nombre del Curso");
        nombreCurso = leer.next();
        System.out.println("Ingrese el Turno del Curso (Mañana o Tarde)");
        turno = leer.next();
        System.out.println("Ingrese la catidad de horas por dia");
        cantidadHorasXDia = leer.nextInt();
        System.out.println("Ingrese la catidad de Dias por semana");
        cantidadDiasXSemana = leer.nextInt();
        System.out.println("Ingrese el precio por Hora");
        precioXHora = leer.nextDouble();
        System.out.println("Cargando Alumnos del curso: "+nombreCurso );
        return new Curso(nombreCurso,turno,cantidadHorasXDia, cantidadDiasXSemana,precioXHora,cargarAlumnos());
    }
    public void calcularGananciaSemanal(Curso curso){
        System.out.println("La Ganacia Semanal del Curso es de "+(5*curso.getCantidadDiasXSemana()*curso.getCantidadHorasXDia()*curso.getPrecioXHora()));
    }
}
