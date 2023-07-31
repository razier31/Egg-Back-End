/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;

/**
 *
 * @author Ramiro
 */
public class CafeteraService {
    
    public void llenarCafetera(Cafetera modelo){
        modelo.setCantidadActual(modelo.getCapacidadMax());
    }
    
    public void servirTaza(Cafetera modelo, int taza){
        if (modelo.getCantidadActual()<taza) {
            System.out.println("La taza se lleno al "+modelo.getCantidadActual()+ "de su capacidad");
            vaciarCafetera(modelo);
            
        }else{
            System.out.println("La taza se lleno");
            modelo.setCantidadActual(modelo.getCantidadActual()-taza);
            System.out.println("Quedan "+modelo.getCantidadActual()+" CM3 en la Cafetera");
        }
    }
    
    public void vaciarCafetera(Cafetera modelo){
        modelo.setCantidadActual(0);
        System.out.println("La cafetera esta Vacia");
    }
    
    public void agregarCafe(Cafetera modelo, int cafe){
        if (cafe<=(modelo.getCapacidadMax()-modelo.getCantidadActual())) {
            System.out.println("Se agregaron "+cafe+" CM3 de Cafe");
            modelo.setCantidadActual(modelo.getCantidadActual()+cafe);
        }else{
            System.out.println("La cantidad de Cafe que desea Ingresar excede la Capacidad Maxima de la Cafetera");
        }
    }
}
