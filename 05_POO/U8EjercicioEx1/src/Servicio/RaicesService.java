/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;

/**
 *
 * @author Ramiro
 */


public class RaicesService {
    
    //a) Método getDiscriminante(): devuelve el valor del discriminante
    //(double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
    public double getDiscriminante(Raices raiz){
        return Math.pow(raiz.getB(), 2)- 4 * raiz.getA()* raiz.getC();
    }
    // b) Método tieneRaices(): devuelve un booleano indicando si tiene dos
    //soluciones, para que esto ocurra, el discriminante debe ser mayor o
    //igual que 0.
    public boolean tieneRaices(Raices raiz){
        if (getDiscriminante(raiz)>0) {
            return true;
        }else{
            return false;
        }
    }
    //c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
    //única solución, para que esto ocurra, el discriminante debe ser igual
    //que 0.
    public boolean tieneRaiz(Raices raiz){
        if (getDiscriminante(raiz)==0) {
            return true;
        }else{
            return false;
        }
    }
    //d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true,
    //imprime las 2 posibles soluciones.
    public void obtenerRaices(Raices raiz){
        if (tieneRaices(raiz)) {
            System.out.println("Solucion 1: "+((-raiz.getB()+Math.sqrt(Math.pow(raiz.getB(), 2)- 4 * raiz.getA()* raiz.getC())))/2*raiz.getA());
            System.out.println("Solucion 2: "+((-raiz.getB()-Math.sqrt(Math.pow(raiz.getB(), 2)- 4 * raiz.getA()* raiz.getC())))/2*raiz.getA());
        }
    }
    // e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime
    //una única raíz. Es en el caso en que se tenga una única solución
    //posible.
    public void obtenerRaiz(Raices raiz){
        if (tieneRaiz(raiz)) {
            System.out.println("Solucion : "+((-raiz.getB()+Math.sqrt(Math.pow(raiz.getB(), 2)- 4 * raiz.getA()* raiz.getC())))/2*raiz.getA());
        }
    }
    //f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
    //y mostrará por pantalla las posibles soluciones que tiene nuestra
    //ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
    //que devuelvan nuestros métodos y en caso de no existir solución, se
    //mostrará un mensaje.
    public void calcular(Raices raiz){
        if (tieneRaices(raiz)) {
            obtenerRaices(raiz);
        }else if (tieneRaiz(raiz)) {
            obtenerRaiz(raiz);
        }else{
            System.out.println("No tiene solucion");
        }
    }
}
