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
public class Perro extends Animal {

    public Perro(String nombre, String alimento, Integer edad) {
        super(nombre, alimento, edad, Razas.PERRO);
    }

    @Override
    public void Alimentarse() {
        System.out.println("El "+ this.getRaza() +" "+ this.getNombre()+" se Alimenta de "+this.getAlimento());       
    }
    
    
}
