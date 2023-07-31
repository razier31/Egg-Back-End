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
final public class Yate extends Amotor {
    private Integer camarotes;

    public Yate() {
    }

    public Yate(Integer camarotes, Integer potencia, String matricula, Double eslora, Integer anioFabricacion) {
        super(potencia, matricula, eslora, anioFabricacion);
        this.camarotes = camarotes;
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }
    
    
}
