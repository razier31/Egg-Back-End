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
public class Ahorcado {
    private int tam;
    private char[] palabra = new char[tam];
    private int cantLetrasEncontradas, jugadasMax;

    public Ahorcado(char[] palabra,int tam, int jugadasMax) {
        this.palabra = palabra;
        this.tam = tam;
        this.cantLetrasEncontradas = 0;
        this.jugadasMax = jugadasMax;
    }

    public int getTam() {
        return tam;
    }

    public int getCantLetrasEncontradas() {
        return cantLetrasEncontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public char[] getPalabra() {
        return palabra;
    }
    
    
}
