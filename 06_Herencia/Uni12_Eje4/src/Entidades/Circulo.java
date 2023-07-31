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
public class Circulo implements calculosFormas {
    private Double radio;
    private Double diametro;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
        this.diametro = 2 * radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    @Override
    public void calcularArea() {
        System.out.println("El Area del Circulo es:\n"+(Math.PI*Math.pow(this.getRadio(), 2)));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El Perimetro del Circulo es:\n"+(Math.PI* this.getDiametro()));
    }
    
    
}
