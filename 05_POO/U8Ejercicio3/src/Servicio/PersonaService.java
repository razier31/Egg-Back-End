/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class PersonaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public boolean esMayorDeEdad(Persona P){
        if (P.getEdad()>17) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public Persona crearPersona(){
        Persona nueva = new Persona();
        System.out.println("Ingrese el Nombre");
        nueva.setNombre(leer.next());
        System.out.println("Ingrese Edad");
        nueva.setEdad(leer.nextInt());
        do {
            System.out.println("Ingrese el sexo \nH = Hombre \nM = Mujer \nO = Otro");
            nueva.setSexo(leer.next());
        } while (!nueva.getSexo().equals("M")&&!nueva.getSexo().equals("H")&&!nueva.getSexo().equals("O"));
        System.out.println("Ingrese el Peso");
        nueva.setPeso(leer.nextFloat());
        System.out.println("Ingrese la Altura");
        nueva.setAltura(leer.nextFloat());
        return nueva;
    }
    
    public int calcularIMC(Persona P){
        double imc;
        imc = (P.getPeso())/Math.pow(P.getAltura(), 2);
        if (imc<20) {
            return -1;
        }else if (imc>=20&&imc<=25) {
            return 0;
        }else{
            return 1;
        }
    }
}
