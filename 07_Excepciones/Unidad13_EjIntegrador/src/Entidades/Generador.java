/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Ramiro
 */
public class Generador {
    protected Double energia = Double.MAX_VALUE;
    
    public void consumo(Double consumo){
        energia = energia - consumo;
    }
}
