/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Ramiro
 */
public class Rectangulo {
    private float lado1;
    private float lado2;

    public Rectangulo() {
    }

    public Rectangulo(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public float getLado1() {
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
    
    public void calcular_area(){
        System.out.println("El Area del Rectangulo es de: "+(this.getLado1()*this.getLado2()));
    }
}
