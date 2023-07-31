/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Mes;
import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class MesService {
    public void juego(Mes obj){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String dato;
        do {
            System.out.println("Ingrese el mes en minusculas");
            dato = leer.next();
            if (obj.getMesSecreto().equals(dato)) {
                System.out.println("¡Ha Acertado!");
            }else{
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
            }
        } while (!obj.getMesSecreto().equals(dato));
        
    }
}
