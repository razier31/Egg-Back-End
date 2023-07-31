/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base");
        this.setBase(leer.nextInt());
        System.out.println("Ingrese la Altura");
        this.setAltura(leer.nextInt());
    }
    
    public void superficie(){
        System.out.println("La superficie es:\n"+(base*altura));
    }
    
    public void perimetro(){
        System.out.println("El Perimetro es:\n"+((base+altura)*2));
    }
    
    public void dibujar(){
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= base; j++) {
                if (i==1||i==altura||j==1||j==base) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
