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
public class CuentaBancaria {
    private int numCuenta;
    private long dni;
    private double saldoAct;

    public CuentaBancaria() {
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public long getDni() {
        return dni;
    }

    public double getSaldoAct() {
        return saldoAct;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoAct(double saldoAct) {
        this.saldoAct = saldoAct;
    }

        
}
