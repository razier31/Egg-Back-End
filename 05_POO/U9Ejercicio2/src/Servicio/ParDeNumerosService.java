/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.ParDeNumeros;

/**
 *
 * @author Ramiro
 */
public class ParDeNumerosService {
//Método mostrarValores que muestra cuáles son los dos números
//guardados.
    public void mostrarValores(ParDeNumeros par){
        System.out.println("NUMERO 1 = "+par.getNum1()+"\nNUMERO 2 = "+par.getNum2());
    }
//Método devolverMayor para retornar cuál de los dos atributos tiene
//el mayor valor
    public double devolverMayor(ParDeNumeros par){
       return Math.max(par.getNum1(), par.getNum2());
    }
    public double devolverMenor(ParDeNumeros par){
        return Math.min(par.getNum1(), par.getNum2());
    }
//Método calcularPotencia para calcular la potencia del mayor valor de
//la clase elevado al menor número. Previamente se deben redondear
//ambos valores.
    public void calcularPotencia(ParDeNumeros par){
        System.out.println("La potencia del numero mas Grande con el mas Chico es :"+Math.pow(Math.round(this.devolverMayor(par)), Math.round(this.devolverMenor(par))));
    }
//Método calculaRaiz, para calcular la raíz cuadrada del menor de los
//dos valores. Antes de calcular la raíz cuadrada se debe obtener el
//valor absoluto del número.
    public void calcularRaiz(ParDeNumeros par){
        System.out.println("La raiz cuadradada del menor numero es "+Math.sqrt(Math.abs(this.devolverMenor(par))));
    }
}
