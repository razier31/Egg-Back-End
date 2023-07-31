/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;

/**
 *
 * @author Ramiro
 */
public class CadenaService {
//a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
//que tiene la frase ingresada
    public void mostrarVocales(Cadena frase){
        char letra;
        int conA = 0, conE = 0, conI = 0, conO = 0, conU = 0;
        
        for (int i = 0; i < frase.getLongitud(); i++) {
            letra = frase.getFrase().charAt(i);
            if (letra == 'A'||letra == 'a') {
                conA++;
            }else if (letra == 'E'||letra == 'e') {
                conE++;
            }else if (letra == 'I'||letra == 'i') {
                conI++;
            }else if (letra == 'O'||letra == 'o') {
                conO++;
            }else if (letra == 'U'||letra == 'u') {
                conU++;
            }
        }
        System.out.println("CONTADOR DE VOCALES\nA = "+conA+"\nE = "+conE+"\nI = "+conI+"\nO = "+conO+"\nU = "+conU);
    }
//b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
//por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
//asac".
    public void invertirFrase(Cadena frase){
        System.out.println("\nFRASE INVERTIDA:");
        char[] arrayFrase = frase.getFrase().toCharArray();
        for (int i = frase.getLongitud()-1; i > -1; i--) {
            System.out.print(arrayFrase[i]);
        }
        System.out.println("");
    }
//c) Método vecesRepetido(String letra), recibirá un carácter ingresado
//por el usuario y contabilizar cuántas veces se repite el carácter en la
//frase, por ejemplo:
//d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
//veces.
    public void vecesRepetido(Cadena frase,String letra){
        char buscar = letra.charAt(0);
        char[] arrayFrase = frase.getFrase().toCharArray();
        int cont = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (arrayFrase[i]==buscar) {
                cont++;
            }
        }
        System.out.println("La Letra "+letra+" se Encuentra repetida "+cont+" veces");
    }
//e) Método compararLongitud(String frase), deberá comparar la longitud
//de la frase que compone la clase con otra nueva frase ingresada por
//el usuario.
    public void compararLongitud(Cadena frase1, String frase2){
        if (frase1.getLongitud()>frase2.length()) {
            System.out.println("La Primer Frase es Mayor\n1° FRASE: "+frase1.getLongitud()+" caracteres\n2° FRASE: "+frase2.length()+" caracteres");
        }else if (frase1.getLongitud()<frase2.length()) {
            System.out.println("La Segunda Frase es Mayor\n1° FRASE: "+frase1.getLongitud()+" caracteres\n2° FRASE: "+frase2.length()+" caracteres");
        }else{
            System.out.println("La Segunda Frase es Mayor\n1° FRASE: "+frase1.getLongitud()+" caracteres\n2° FRASE: "+frase2.length()+" caracteres");
        }
    }
//f) Método unirFrases(String frase), deberá unir la frase contenida en la
//clase Cadena con una nueva frase ingresada por el usuario y mostrar
//la frase resultante.
    public void unirFrases(Cadena frase1, String frase2){
        frase1.setFrase(frase1.getFrase().concat(frase2));
        System.out.println("NUEVA FRASE:\n"+frase1.getFrase());
    }
//g) Método reemplazar(String letra), deberá reemplazar todas las letras
//“a” que se encuentren en la frase, por algún otro carácter
//seleccionado por el usuario y mostrar la frase resultante.
    public void reemplazar(Cadena frase, String letra){
        frase.setFrase(frase.getFrase().replace('a', letra.charAt(0)));
    }
//h) Método contiene(String letra), deberá comprobar si la frase contiene
//una letra que ingresa el usuario y devuelve verdadero si la contiene y
//falso si no.
    public boolean contiene(Cadena frase,String letra){
        char buscar = letra.charAt(0);
        char[] arrayFrase = frase.getFrase().toCharArray();
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (arrayFrase[i]==buscar) {
                return true;
            }
        }
    return false;
    }
}
