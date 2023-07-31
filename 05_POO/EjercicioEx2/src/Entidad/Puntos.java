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
public class Puntos {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Puntos() {
    }

    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    
    
    public void crearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("PRIMER PUNTO:\nIngrese la Coordenada X");
        this.setX1(leer.nextDouble());
        System.out.println("Ingrese la Coordenada Y");
        this.setY1(leer.nextDouble());
        System.out.println("Primer Punto Cargado...");
        System.out.println("SEGUNDO PUNTO:\nIngrese la Coordenada X");
        this.setX2(leer.nextDouble());
        System.out.println("Ingrese la Coordenada Y");
        this.setY2(leer.nextDouble());
        System.out.println("Segundo Punto Cargado...");
    }
        
    public void distanciaPtos(){
        System.out.println("La Distancia entre los dos Puntos es de:");
        System.out.println(Math.sqrt((Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2))));
    }
}
