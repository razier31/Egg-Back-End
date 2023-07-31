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
public class Electrodomestico {
    
    protected Double precio;
    protected String color;
    protected String consumo;
    protected Integer peso;
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, String consumo, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    
    public String comprobarConsumoEnergetico(String letra){
        String aux = "F";
        String valores[] = {"A","B","C","D","E","F"};
        letra.toUpperCase();
        
        for (String val : valores) {
            if (val.equals(letra)) {
                aux = letra;
                break;
            }
        }
        return aux;
    }
    
    public String comprobarColor(String color){
        String aux = "blanco";
        String valores[] = {"blanco","negro","azul","rojo","gris"};
        color.toLowerCase();
        
        for (String val : valores) {
            if (val.equals(color)) {
                aux = color;
                break;
            }
        }
        return aux;
    }
    
    public void crearElectrodomestico(){
        this.setPrecio(1000d);
        System.out.println("Ingrese el Color");
        String color = leer.next();
        this.setColor(comprobarColor(color));
        System.out.println("Ingrese la letra de su consumo energetico desde la A a la F");
        String letra = leer.next();
        this.setConsumo(comprobarConsumoEnergetico(letra));
        System.out.println("Ingrese el Peso");
        this.setPeso(leer.nextInt());
    }
    
    public void precioFinal(){
        switch (this.getConsumo()) {
            case "A":
                this.setPrecio(this.getPrecio()+1000d);
                break;
            case "B":
                this.setPrecio(this.getPrecio()+800d);
                break;
            case "C":
                this.setPrecio(this.getPrecio()+600d);
                break;
            case "D":
                this.setPrecio(this.getPrecio()+500d);
                break;
            case "E":
                this.setPrecio(this.getPrecio()+300d);
                break;
            case "F":
                this.setPrecio(this.getPrecio()+100d);
                break;
        }
        if (this.getPeso()<20) {
            this.setPrecio(this.getPrecio()+100d);
        }else if (this.getPeso()>19&&this.getPeso()<50) {
            this.setPrecio(this.getPrecio()+500d);
        }else if (this.getPeso()>49&&this.getPeso()<80) {
            this.setPrecio(this.getPrecio()+800d);
        }else {
            this.setPrecio(this.getPrecio()+1000d);
        }
    }
}
