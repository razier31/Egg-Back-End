/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class Circunferencia {
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Radio de la Circunferencia");
        this.setRadio(leer.nextDouble());
    }
    
    public void area(){
        System.out.println("El Area de la Circunferencia es:\n"+(Math.PI*Math.pow(radio, 2)));
    }
    
    public void perimetro(){
        System.out.println("El Perimetro de la Circunferencia es:\n"+(2*radio*Math.PI));
    }

    
}
