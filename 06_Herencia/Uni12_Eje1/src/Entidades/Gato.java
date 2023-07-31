/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumeradores.Razas;

/**
 *
 * @author Ramiro
 */
public class Gato extends Animal {

    public Gato(String nombre, String alimento, Integer edad, Razas raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void Alimentarse() {
        System.out.println("El Gato " + this.getNombre()+" se Alimenta de "+this.getAlimento());
    }
}
