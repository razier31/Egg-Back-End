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
public class Operacion {
    private double num1;
    private double num2;

    public Operacion() {
    }

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Primer numero");
        this.setNum1(leer.nextDouble());
        System.out.println("Ingrese el Segundo numero");
        this.setNum2(leer.nextDouble());
    }
    
    public double sumar(){
        double total;
        total = num1 + num2;
        return total;
    }
    
    public double restar(){
        double total;
        total = num1 - num2;
        return total;
    }
    
    public double multiplicar(){
        double total = 0;
        if (num2!=0) {
            total = num1 * num2;
        }else{
            System.out.println("ERROR multipicacion por cero");
        }
        return total;
    }
    
    public double dividir(){
        double total = 0;
        if (num2!=0) {
            total = num1 / num2;
        }else{
            System.out.println("ERROR Division por cero");
        }
        return total;
    }
}
