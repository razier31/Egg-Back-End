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
public class Mes {
    private String[] meses = new String[] {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesSecreto;

   
    public Mes() {
        this.mesSecreto = meses[(int)(Math.random()*11)];
    }

    public String getMesSecreto() {
        return mesSecreto;
    }
    
    
}
