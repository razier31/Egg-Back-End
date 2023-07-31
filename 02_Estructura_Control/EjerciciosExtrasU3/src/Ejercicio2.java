/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */

/**
 *
 * @author Ramiro
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A = 20;
        int B = 40;
        int C = 60;
        int D = 80;
        int aux;
        aux = B;
        B = C;
        System.out.println("El Antiguo Valor de B es: "+aux+" El Nuevo Valor de B es: "+B);
        aux = C;
        C = A;
        System.out.println("El Antiguo Valor de C es: "+aux+" El Nuevo Valor de C es: "+C);
        aux = A;
        A = D;
        System.out.println("El Antiguo Valor de A es: "+aux+" El Nuevo Valor de A es: "+A);
        aux = D;
        D = B ;
        System.out.println("El Antiguo Valor de D es: "+aux+" El Nuevo Valor de D es: "+D);
    }
    
}
