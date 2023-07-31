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
public class Empleado {
    private String nombre;
    private int edad;
    private long salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, long salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public long getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }
    
    public void calcular_aumento(int edad){
        if (edad>30) {
            System.out.println("Al empleado "+this.getNombre()+" le corresponde un aumento del 10%\nSu nuevo Salario es de "+(this.getSalario()+this.getSalario()*0.1));
        }else{
            System.out.println("Al empleado "+this.getNombre()+" le corresponde un aumento del 5%\nSu nuevo Salario es de "+(this.getSalario()+this.getSalario()*0.05));
        }
    }
    
}
