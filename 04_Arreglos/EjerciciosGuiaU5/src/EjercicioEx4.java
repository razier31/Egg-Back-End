
import java.util.Scanner;

/*
Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.
*/

/**
 *
 * @author Ramiro
 */
public class EjercicioEx4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float[][] alumnos = new float[10][5];
        cargarNotas(alumnos);
        aprobados(alumnos);
        mostrar(alumnos);
    }
    public static float[][] cargarNotas(float[][] matriz){
        Scanner leer = new Scanner(System.in);
        float promedio;
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+"° ALUMNO:");
            promedio = 0;
            for (int j = 0; j < 4; j++) {
                do {
                    System.out.println("Ingrese la "+(j+1)+"° Nota entre 0 y 10");
                    matriz[i][j]= leer.nextInt();
                    if (matriz[i][j]<0||matriz[i][j]>10) {
                        System.out.println("La nota Ingresada no es Correcta");
                    }
                } while (matriz[i][j]<0||matriz[i][j]>10);
                switch (j) {
                    case 0:
                        System.out.println("Nota del Primer trabajo práctico evaluativo Ingresada");
                        promedio += matriz[i][j]*0.1;
                        break;
                    case 1:
                        System.out.println("Nota del Segundo trabajo práctico evaluativo Ingresada");
                        promedio += matriz[i][j]*0.15;
                        break;
                    case 2:
                        System.out.println("Nota del Primer Integrador Ingresada");
                        promedio += matriz[i][j]*0.25;
                        break;
                    case 3:
                        System.out.println("Nota del Segundo Integrador Ingresada");
                        promedio += matriz[i][j]*0.5;
                        break;
                }
                                                
            }
            matriz[i][4] = promedio;            
        }
        return matriz;
    }
    public static void mostrar(float[][] matriz){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" | "+matriz[i][j]+" | ");
            }
            System.out.println("");
        }
    }
    public static void aprobados(float[][] matriz){
        System.out.println("Lista de Alumnos Aprobados");
        for (int i = 0; i < 10; i++) {
            if (matriz[i][4]>=7) {
                System.out.println((i+1)+"° Alumno: APROBADO");
            }else{
                System.out.println((i+1)+"° Alumno: DESAPROBADO");
            }
        }
    }
}
