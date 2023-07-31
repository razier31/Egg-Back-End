/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class Armadura {
    private Scanner leer = new Scanner(System.in);
    private String colorPri;
    private String colorSec;
    private Integer salud = 100;
    private Generador generador = new Generador();
    private Propulsor pieIzq = new Propulsor();
    private Propulsor pieDer = new Propulsor();
    private Repulsor braIzq = new Repulsor();
    private Repulsor braDer = new Repulsor();

    public Armadura() {
    }
    
     public void caminar(){
         System.out.println("Cuanto tiempo desea caminar expresado en minutos");
         Double caminar = leer.nextDouble();
         generador.consumo(pieIzq.usoEnergia("basico", caminar));
         generador.consumo(pieDer.usoEnergia("basico", caminar));
    }
    
    public void correr(){
        System.out.println("Cuanto tiempo desea correr expresado en minutos");
         Double correr = leer.nextDouble();
         generador.consumo(pieIzq.usoEnergia("normal", correr));
         generador.consumo(pieDer.usoEnergia("normal", correr));
    }
    
    public void propulsarse(){
    }
    
    public void volar(){
    }
    
    public void escribirOhablar(){
    }

    
    
    
}
