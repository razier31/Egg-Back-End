/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Arrays;
import java.util.Collections;


/**
 *
 * @author Ramiro
 */
public class ArregloService {
//Método inicializarA recibe un arreglo por parámetro y lo inicializa con
//números aleatorios.
    public void inicializarA(Double[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (Math.random()*50)+1;
        }
    }
//Método mostrar recibe un arreglo por parámetro y lo muestra por
//pantalla.
    public void mostrar(Double[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" [ "+(vector[i])+" ] ");
        }
        System.out.println("");
    }
//Método ordenar recibe un arreglo por parámetro y lo ordena de
//mayor a menor.
    public void ordenar(Double[] vector){
        Arrays.sort(vector,Collections.reverseOrder());
        
		
//		Arrays.sort(arr);
//		int aux[]=new int[arr.length];
//		for(int i=arr.length-1;i>-1;i--) {
//			
//			for(int j=0;j<arr.length;j++) {
//			
//				aux[j]=arr[i];
//				i--;
//			}
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=aux[i];
//		}
//	}
    }
//Método inicializarB copia los primeros 10 números del arreglo A en el
//arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    public void inicializarB(Double[] vecA, Double[] vecB){
        for (int i = 0; i < 10; i++) {
            vecB[i] = vecA[i];
        }
        Arrays.fill(vecB, 10, 20, 0.5);
    }
}


