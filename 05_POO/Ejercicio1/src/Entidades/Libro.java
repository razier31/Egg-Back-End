/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Ramiro
 */
public class Libro {
    private int ISBN;
    private String Titulo;
    private String Autor;
    private int paginas;

    public Libro() {
    }

    public Libro(int ISBN, String Titulo, String Autor, int paginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.paginas = paginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public void cargarLibro(){
        Scanner leer = new Scanner(System.in);
        Scanner leerTxt = new Scanner(System.in);
        System.out.println("Por Favor ingrese el numero de ISBN del libro");
        this.setISBN(leer.nextInt());
        System.out.println("Por Favor ingrese el Titulo del libro");
        this.setTitulo(leerTxt.nextLine());
        System.out.println("Por Favor ingrese el Autor del libro");
        this.setAutor(leerTxt.nextLine());
        System.out.println("Por Favor ingrese el numero de Paginas del libro");
        this.setPaginas(leer.nextInt());
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", paginas=" + paginas + '}';
    }
    
    
}
