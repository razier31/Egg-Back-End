/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Interfaces.calculosFormas;

/**
 *
 * @author Ramiro
 */
public class Rectangulo implements calculosFormas{
    private Double base;
    private Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        System.out.println("El Area del Rectangulo es:\n"+(this.getBase()*this.getAltura()));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El Perimetro del Rectangulo es:\n"+((this.getBase()+this.getAltura())*2));
    }
    
    
}
