/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package uni12_eje4;

import Entidades.Circulo;
import Entidades.Rectangulo;

/**
 *
 * @author Ramiro
 */
public class Uni12_Eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo cir1 = new Circulo(15d);
        Rectangulo rec1 = new Rectangulo(2d,4d);
        
        cir1.calcularArea();
        cir1.calcularPerimetro();
        
        rec1.calcularArea();
        rec1.calcularPerimetro();
    }
    
}
