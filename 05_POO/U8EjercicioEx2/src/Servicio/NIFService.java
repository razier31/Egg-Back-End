/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class NIFService {
    Scanner leer = new Scanner(System.in);
    public String buscarLetra(int dni){
        String[] letraVec = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        return letraVec[dni%23];
    }
//Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
//letra que le corresponderá. Una vez calculado, le asigna la letra que
//le corresponde según
    public NIF crearNif(){
        NIF nuevoNif = new NIF();
        System.out.println("Ingrese el numero del Dni");
        nuevoNif.setNumDni(leer.nextInt());
        nuevoNif.setLetra(buscarLetra(nuevoNif.getNumDni()));
        return nuevoNif;
    }
//Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un
//guion y la letra en mayúscula; por ejemplo: 00395469-F)
    public void mostrar(NIF nuevo){
        System.out.println("El numero NIF es:\n"+nuevo.getNumDni()+"-"+nuevo.getLetra());
    }
}
