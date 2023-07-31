/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class CuentaBancariaService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria crearCta(){
        CuentaBancaria newCta = new CuentaBancaria();
        double saldo;
        System.out.println("Creando Nueva Cuenta...");
        System.out.println("Ingrese el numeero de Cuenta");
        newCta.setNumCuenta(leer.nextInt());
        System.out.println("Ingrese el numero de Dni del titular");
        newCta.setDni(leer.nextLong());
        System.out.println("Ingrese el Saldo Actual de la Cuenta\nNota: Solo se aceptaran Saldos Mayores que cero en caso contrario la Cta se Inicia en 0");
        saldo = leer.nextDouble();
        if (saldo>0) {
            newCta.setSaldoAct(saldo);
        }else{
            newCta.setSaldoAct(0);
        }
        return newCta;
    }
    
    public void ingresar(CuentaBancaria cta,double monto){
        if (monto>0) {
            cta.setSaldoAct(cta.getSaldoAct()+monto);
        }else{
            System.out.println("No se Puede ingresar montos Negativos");
        }
    }
    
    public void retirar(CuentaBancaria cta, double extraer){
        if (extraer<=cta.getSaldoAct()) {
            cta.setSaldoAct(cta.getSaldoAct()-extraer);
            System.out.println("El saldo actual es: "+cta.getSaldoAct());
        }else{
            System.out.println("No dispone de ese dinero para la Extraccion\nExtrayendo ... "+cta.getSaldoAct());
            cta.setSaldoAct(cta.getSaldoAct()-cta.getSaldoAct());
        }
    }
    
    public void extraccionRapida(CuentaBancaria cta, double extraer){
        if (extraer>cta.getSaldoAct()*0.2) {
            System.out.println("No se Puede Extraer mas que el 20%\nCantidad Maxima para Extraccion Rapida: "+(cta.getSaldoAct()*0.2));
        }else{
            cta.setSaldoAct(cta.getSaldoAct()-extraer);
        }
    }
    
    public void consultarSaldo(CuentaBancaria cta){
        System.out.println("SALDO: "+cta.getSaldoAct());
    }
    
    public void consultarDatos(CuentaBancaria cta){
        System.out.println("CTA: "+cta.getNumCuenta()+"\nDNI: "+cta.getDni());
    }
}
