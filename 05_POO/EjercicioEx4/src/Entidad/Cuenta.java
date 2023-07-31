/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Ramiro
 */
public class Cuenta {
    private String titular;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void retirar_dinero(double retiro){
        if (retiro<=this.getSaldo()) {
            this.setSaldo(this.getSaldo()-retiro);
            System.out.println("RETIRO REALIZADO EXITOSAMENTE");
        }else{
            System.out.println("SALDO INSUFICIENTE PARA REALIZAR EL RETIRO");
        }
    }

    @Override
    public String toString() {
        return "CUENTA\n\n" + "TITULAR:\n" + titular + "\n SALDO:\n" + saldo ;
    }
    
    
}
