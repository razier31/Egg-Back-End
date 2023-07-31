/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni12_eje1;

import Entidades.Animal;
import Entidades.Perro;
import Enumeradores.Razas;

/**
 *
 * @author Ramiro
 */
public class Uni12_Eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal perro1 = new Perro("Boby", "Carne", 15);
        perro1.Alimentarse();
        
        
    }
    
}
