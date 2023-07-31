/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u8ejercicio2;

import Entidades.Cafetera;
import Servicios.CafeteraService;
import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class U8Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cafetera nesPre01 = new Cafetera(1000,0);
        CafeteraService control = new CafeteraService();
        control.llenarCafetera(nesPre01);
        System.out.println("Inserte el tamaño dela taza");
        control.servirTaza(nesPre01, leer.nextInt());
        control.agregarCafe(nesPre01, 50);
        control.vaciarCafetera(nesPre01);
    }
    
}
