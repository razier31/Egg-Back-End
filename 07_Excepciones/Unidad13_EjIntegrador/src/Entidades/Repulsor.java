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
public class Repulsor{
    public Boolean danio = false;
    
    public Double usoEnergia(String nivel, Double tiempo){
        Double energia;
        switch (nivel) {
            case "basico":
                energia = 1 * tiempo;
                break;
            case "normal":
                energia = 2 * tiempo;
                break;
            case "intensivo":
                energia = 3 * tiempo;
                break;
            default:
                throw new AssertionError();
        }
        return energia;
    }
}
