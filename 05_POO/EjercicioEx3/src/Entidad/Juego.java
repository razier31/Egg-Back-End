/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class Juego {
    private int intentosMax;
    private int numero;
    private int winPlayer1;
    private int winPlayer2;

    public Juego() {
        winPlayer1 = 0;
        winPlayer2 = 0;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public int getNumero() {
        return numero;
    }
    
    public int getWinPlayer1() {
        return winPlayer1;
    }

    public int getWinPlayer2() {
        return winPlayer2;
    }

    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    public void setWinPlayer1(int winPlayer1) {
        this.winPlayer1 += winPlayer1;
    }

    public void setWinPlayer2(int winPlayer2) {
        this.winPlayer2 += winPlayer2;
    }

    
    
    public void iniciar_juego(){
        Scanner leer = new Scanner(System.in);
        System.out.println("TURNO Jugador 1");
        int aux;
        int cont = 0;
        boolean ban = false;
        
        do {
            System.out.println("Ingrese un numero entre 1 y 20 para que el Jugador 2 Adivine");
            this.setNumero(leer.nextInt());
        } while (this.getNumero()<1||this.getNumero()>20);
        
        do {
            System.out.println("Ingrese la cantidad de intentos  3 y 10 que tendra el Jugador 2");
            this.setIntentosMax(leer.nextInt());
        } while (this.getIntentosMax()<3||this.getIntentosMax()>10);
        
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
        
        System.out.println("TURNO jugador 2");
        
        System.out.println("Trate de Adivinar el Numero del Jugador 1:\nEl mumero se Encuentra entre el 1 y 20");
        System.out.println("Dispone de "+this.getIntentosMax()+" Intentos");
        do {
            cont ++;
            System.out.println("");
            System.out.println(cont+"° INTENTO:\nIngrese un numero");
            aux = leer.nextInt();
            if (aux == this.getNumero()) {
                System.out.println("Numero Correcto Victoria Jugador 2");
                this.setWinPlayer2(1);
                ban = true;
                break;
            }else if (aux > this.getNumero()) {
                System.out.println("El numero Oculto es mas Pequeño");
            }else{
                System.out.println("El numero Oculto es mas Grande");
            }
        } while (cont!=this.getIntentosMax());
        
        if (ban == false) {
            System.out.println("Lastima no pudiste Adivinar el mumero\n Victoria Jugador 1");
            this.setWinPlayer1(1);
        }
    }

    @Override
    public String toString() {
        return "JUEGO\n" + "Victorias Jugador 1 = " + winPlayer1 + "\nVictorias Jugador 2 = " + winPlayer2 ;
    }
    
    
    
}
