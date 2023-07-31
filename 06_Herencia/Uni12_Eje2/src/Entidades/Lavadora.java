/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Ramiro
 */
public final class Lavadora extends Electrodomestico{
    
    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Double precio, String color, String consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
    
    public void crearLavadora() {
        System.out.println("------LAVADORA------");
        System.out.println("Ingrese la capacidad de Carga");
        this.setCarga(leer.nextInt());
        super.crearElectrodomestico();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.getCarga()>30) {
            this.setPrecio(this.getPrecio()+500d);
        }
    }
    
    
}
