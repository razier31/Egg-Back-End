/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class AhorcadoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
//Metodo crearJuego(): le pide la palabra al usuario y cantidad de
//jugadas máxima. Con la palabra del usuario, pone la longitud de la
//palabra, como la longitud del vector. Después ingresa la palabra en el
//vector, letra por letra, quedando cada letra de la palabra en un índice
//del vector. Y también, guarda la cantidad de jugadas máximas y el
//valor que ingresó el usuario.
    public Ahorcado crearJuego(){
        String palabra;
        int tam, jugMax;
        System.out.println("Ingrese la Palabra que desea que Adivinen");
        palabra = leer.next();
        tam = palabra.length();
        char[] palVec = new char[tam];
        palVec = palabra.toCharArray();
        System.out.println("Ingrese la cantidad de Jugadas Maximas");
        jugMax = leer.nextInt();
        return new Ahorcado(palVec,tam,jugMax);
    }
//Método longitud(): muestra la longitud de la palabra que se debe
//encontrar. Nota: buscar como se usa el vector.length.
    public void longitud(Ahorcado obj){
        System.out.println("Longitud de La Palabra: "+obj.getTam());
    }
//Método buscar(letra): este método recibe una letra dada por el
//usuario y busca si la letra ingresada es parte de la palabra o no.
//También informará si la letra estaba o no.
    public void buscar(Ahorcado obj, char letra){
        Boolean ban = false;
        for (int i = 0; i < obj.getTam(); i++) {
            if (letra == obj.getPalabra()[i]) {
                ban = true;
            }
        }
        if (ban) {
            System.out.println("La letra "+letra+" se encuentra en la Palabra");
        }else{
            System.out.println("La letra "+letra+" No se encuentra en la Palabra");
        }
    }
//● Método encontradas(letra): que reciba una letra ingresada por el
//usuario y muestre cuantas letras han sido encontradas y cuántas le
//faltan. Este método además deberá devolver true si la letra estaba y
//false si la letra no estaba, ya que, cada vez que se busque una letra
//que no esté, se le restará uno a sus oportunidades.
    public Boolean encontradas(){
    }
}
