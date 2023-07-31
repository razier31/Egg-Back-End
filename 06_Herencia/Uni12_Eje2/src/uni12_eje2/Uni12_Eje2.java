/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni12_eje2;

import Entidades.Lavadora;
import Entidades.Televisor;
import Entidades.Electrodomestico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramiro
 */
public class Uni12_Eje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Televisor t1 = new Televisor();
        Lavadora l1 = new Lavadora();
        
        t1.crearTelevisor();
        t1.precioFinal();
        System.out.println("El precio final de el Televisor es "+ t1.getPrecio());
        
        l1.crearLavadora();
        l1.precioFinal();
        System.out.println("El precio final de la Lavadora es "+ l1.getPrecio());
        
        List<Electrodomestico> listElectodomesticos = new ArrayList();
        
        Televisor tv1 = new Televisor(40, true, 1000d, "gris", "B", 25);
        Televisor tv2 = new Televisor(41, true, 1000d, "blanco", "A", 30);
        Lavadora la1 = new Lavadora(25, 1000d, "negro", "C", 40);
        Lavadora la2 = new Lavadora(40, 1000d, "blanco", "A", 60);
        
        listElectodomesticos.add(tv1);
        listElectodomesticos.add(tv2);
        listElectodomesticos.add(la1);
        listElectodomesticos.add(la2);
        
        double suma = 0;
        
        for (Electrodomestico aux : listElectodomesticos) {
            aux.precioFinal();
            suma += aux.getPrecio();
            if (aux instanceof Lavadora) {
                System.out.println("---Lavadora---\nPRECIO: "+ aux.getPrecio());
                continue;
            }
            if (aux instanceof Televisor) {
                System.out.println("---Televisor---\nPRECIO: "+ aux.getPrecio());
                continue;
            }
        }
        System.out.println("El total de la Suma de todos los Electrodomesticos es " + suma);
    }
    
}
