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
public class NIF {
    private int numDni;
    private String letra;

    public NIF() {
    }

    public NIF(int numDni, String letra) {
        this.numDni = numDni;
        this.letra = letra;
    }

    public int getNumDni() {
        return numDni;
    }

    public void setNumDni(int numDni) {
        this.numDni = numDni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    
}
