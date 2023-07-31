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
public final class Televisor extends Electrodomestico {
    
    private Integer resolucion;
    private Boolean sintonizadorTDT;   

    public Televisor() {
    }

    public Televisor(Integer resolucion, Boolean sintonizadorTDT, Double precio, String color, String consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public void crearTelevisor(){
        System.out.println("------TELEVISOR------");
        System.out.println("Ingrese las pulgadas del televisor");
        this.setResolucion(leer.nextInt());
        System.out.println("Posee sintonizador TDT si o no? ");
        String resp = leer.next();
        resp.toLowerCase();
        switch (resp) {
            case "si":
                this.setSintonizadorTDT(true);
                break;
            case "no":
                this.setSintonizadorTDT(false);
                break;
            default:
                System.out.println("La opcion ingresada es incorrecta el televisor sera creado sin sintonizador");
                this.setSintonizadorTDT(false);
        }
        super.crearElectrodomestico();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.getResolucion()>40) {
            this.setPrecio(this.getPrecio()+this.getPrecio()*0.3);
        }
        if (this.getSintonizadorTDT()) {
            this.setPrecio(this.getPrecio()+500d);
        }
    }
    
    
}
