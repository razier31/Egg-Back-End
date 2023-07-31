
package libreria;

import java.util.Scanner;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LIbroServicio;


public class Menu {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String pausa;
    private Integer opc;
    private final AutorServicio servAutor = new AutorServicio();
    private final EditorialServicio servEditorial = new EditorialServicio();
    private final LIbroServicio servLibro = new LIbroServicio(); 

    public void principal(){
        try {
            do {
                System.out.println("MENU PRINCIPAL");
                System.out.println("---------------");
                System.out.println("1 = ALTAS");
                System.out.println("2 = MODIFICACIONES");
                System.out.println("3 = BAJAS");
                System.out.println("4 = BUSQUEDAS");
                System.out.println("5 = LISTADOS");
                System.out.println("6 = PAPELERA");
                System.out.println("0 = SALIR");
                System.out.println("---------------");
                System.out.println("INGRESE LA OPCION DESEADA.....");
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        altas();
                        break;
                    case 2:
                        modificaciones();
                        break;
                    case 3:
                        bajas();
                        break;
                    case 4:

                        break;
                    case 5:
                        listar();
                        break;
                    case 6:
                        System.out.println("---------------");
                        System.out.println("PAPELERA");
                        System.out.println("---------------");
                        System.out.println("AUTORES ELIMINADOS");
                        servAutor.papelera();
                        System.out.println("---------------");
                        System.out.println("EDITORIALES ELIMINADAS");
                        servEditorial.papelera();
                        System.out.println("---------------");
                        System.out.println("Pulse enter para Continuar...");
                        pausa = leer.next();
                        break;
                    case 0:
                        System.out.println("Fin del Programa");
                        break;
                    default:
                        System.out.println("El numero ingresado es Incorrecto");
                }
            } while (opc != 0);

        } catch (Exception e) {
        }
    }

    private void altas(){
        long isbn;
        String titulo, nomAutor, nomEditorial;
        Integer anio;
        Integer existencias;

        try {
            do {
                System.out.println("ALTAS");
                System.out.println("---------------");
                System.out.println("1 = AUTORES");
                System.out.println("2 = CLIENTES");
                System.out.println("3 = EDITORIALES");
                System.out.println("4 = LIBROS");
                System.out.println("5 = PRESTAMOS");
                System.out.println("6 = VOLVER");
                System.out.println("---------------");
                System.out.println("INGRESE LA OPCION DESEADA.....");
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("ALTA AUTOR");
                        System.out.println("---------------");
                        System.out.println("Ingrese el nombre del Autor");
                        servAutor.altaAutor(leer.next());
                        System.out.println("Autor Guardado con Exito pulse enter para Continuar...");
                        pausa = leer.next();
                        break;
                    case 2:
                        System.out.println("ALTA CLIENTE");
                        System.out.println("---------------");
                        System.out.println("Ingrese el Documento del Cliente");
                        System.out.println("Ingrese el Nombre del Cliente");
                        System.out.println("Ingrese el Apellido del Cliente");
                        System.out.println("Ingrese el Telefono del Cliente");
                        System.out.println("Cliente Guardado con Exito pulse enter para Continuar...");
                        pausa = leer.next();
                        break;
                    case 3:
                        System.out.println("ALTA EDITORIAL");
                        System.out.println("---------------");
                        System.out.println("Ingrese el nombre de la Editorial");
                        servEditorial.altaEditorial(leer.next());
                        System.out.println("Editorial Guardada con Exito pulse enter para Continuar...");
                        pausa = leer.next();
                        break;
                    case 4:
                        System.out.println("ALTA LIBRO");
                        System.out.println("---------------");
                        System.out.println("Ingrese el ISBN del Libro");
                        isbn= leer.nextLong();
                        System.out.println("Ingrese el Titulo del Libro");
                        titulo = leer.next();
                        System.out.println("Ingrese el Año del Libro");
                        anio = leer.nextInt();
                        System.out.println("Ingrese el Autor del Libro");
                        nomAutor = leer.next();
                        System.out.println("Ingrese la Editorial del Libro");
                        nomEditorial = leer.next();
                        System.out.println("Ingrese el Stock del Libro");
                        existencias = leer.nextInt();
                        servLibro.altaLibro(isbn, titulo, anio, existencias, nomAutor, nomEditorial);
                        System.out.println("Libro Guardado con Exito pulse enter para Continuar...");
                        pausa = leer.next();
                        break;
                    case 5:
                        System.out.println("ALTA PRESTAMO");
                        System.out.println("---------------");
                        System.out.println("Ingrese la fecha del Prestamo");

                        System.out.println("Prestamo Guardado con Exito pulse enter para Continuar...");
                        pausa = leer.next();
                        break;
                    case 6:
                        System.out.println("---------------");
                        break;
                    default:
                        System.out.println("El numero ingresado es Incorrecto");
                }

            } while (opc !=6 );


        } catch (Exception e) {
        }
    }
    
    private void modificaciones(){

        try {
            do {
                System.out.println("MODIFICACIONES");
                System.out.println("---------------");
                System.out.println("1 = AUTORES");
                System.out.println("2 = CLIENTES");
                System.out.println("3 = EDITORIALES");
                System.out.println("4 = LIBROS");
                System.out.println("5 = PRESTAMOS");
                System.out.println("6 = VOLVER");
                System.out.println("---------------");
                System.out.println("INGRESE LA OPCION DESEADA.....");
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("MODIFICAR AUTOR");
                        System.out.println("---------------");
                        System.out.println("Ingrese el nombre del Autor que desea modificar");
                        pausa = leer.next();
                        System.out.println("Ingrese el nuevo nombre del Autor");        
                        servAutor.modificarAutor(pausa, leer.next());
                        System.out.println("Autor Modificado con Exito pulse enter para Continuar...");
                        pausa = leer.next();
                        break;
                    case 2:
                        System.out.println("MODIFICAR CLIENTE");
                        System.out.println("---------------");
                        System.out.println("Ingrese el Documento del Cliente que desea Modificar");
                        System.out.println("Ingrese el  nuevo Documento");
                        System.out.println("Ingrese el  nuevo Nombre");
                        System.out.println("Ingrese el nuevo Apellido");
                        System.out.println("Ingrese el nuevo Telefono");
                        System.out.println("Cliente Modificado con Exito pulse enter para Continuar...");
                        pausa = leer.next();
                        break;
                    case 3:
                        System.out.println("MODIFICAR EDITORIAL");
                        System.out.println("---------------");
                        System.out.println("Ingrese el nombre de la Editorial que desea modificar");
                        pausa = leer.next();
                        System.out.println("Ingrese el nuevo nombre de la Editorial");        
                        servEditorial.modificarEditorial(pausa, leer.next());
                        System.out.println("Editorial Modificada con Exito pulse enter para Continuar...");
                        pausa = leer.next();
                        break;
                    case 4:
                        System.out.println("ALTA LIBRO");
                        System.out.println("---------------");
                        System.out.println("Ingrese el Titulo del Libro");

                        System.out.println("Libro Guardado con Exito pulse enter para Continuar...");
                        pausa = leer.next();
                        break;
                    case 5:
                        System.out.println("ALTA PRESTAMO");
                        System.out.println("---------------");
                        System.out.println("Ingrese la fecha del Prestamo");

                        System.out.println("Prestamo Guardado con Exito pulse enter para Continuar...");
                        pausa = leer.next();
                        break;
                    case 6:
                        System.out.println("---------------");
                        break;
                    default:
                        System.out.println("El numero ingresado es Incorrecto");
                }

            } while (opc !=6 );


        } catch (Exception e) {
        }
    }
    
    private void bajas(){

        try {
            do {
                System.out.println("BAJAS");
                System.out.println("---------------");
                System.out.println("1 = AUTORES");
                System.out.println("2 = CLIENTES");
                System.out.println("3 = EDITORIALES");
                System.out.println("4 = LIBROS");
                System.out.println("5 = PRESTAMOS");
                System.out.println("6 = VOLVER");
                System.out.println("---------------");
                System.out.println("INGRESE LA OPCION DESEADA.....");
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("BAJA AUTOR");
                        System.out.println("---------------");
                        System.out.println("Ingrese el nombre del Autor que desea Eliminar");
                        servAutor.bajaAutor(leer.next());
                        System.out.println("Autor Eliminado con Exito pulse enter para Continuar...");
                        pausa = leer.next();
                        break;
                    case 2:
                        System.out.println("BAJA CLIENTE");
                        System.out.println("---------------");
                        System.out.println("Ingrese el Documento del Cliente");
                        System.out.println("Cliente Eliminado con Exito pulse enter para Continuar...");
                        pausa = leer.next();
                        break;
                    case 3:
                        System.out.println("BAJA EDITORIAL");
                        System.out.println("---------------");
                        System.out.println("Ingrese el nombre de la Editorial que desea eliminar");
                        servEditorial.bajaEditorial(leer.next());
                        System.out.println("Editorial Eliminada con Exito pulse enter para Continuar...");
                        pausa = leer.next();
                        break;
                    case 4:
                        System.out.println("BAJA LIBRO");
                        System.out.println("---------------");
                        System.out.println("Ingrese el Titulo del Libro");

                        System.out.println("Libro Eliminado con Exito pulse enter para Continuar...");
                        pausa = leer.next();
                        break;
                    case 5:
                        System.out.println("BAJA PRESTAMO");
                        System.out.println("---------------");
                        System.out.println("Ingrese la fecha del Prestamo");

                        System.out.println("Prestamo Eliminado con Exito pulse enter para Continuar...");
                        pausa = leer.next();
                        break;
                    case 6:
                        System.out.println("---------------");
                        break;
                    default:
                        System.out.println("El numero ingresado es Incorrecto");
                }

            } while (opc !=6 );


        } catch (Exception e) {
        }
    }
    
        private void listar(){

        try {
            do {
                System.out.println("LISTAR");
                System.out.println("---------------");
                System.out.println("1 = AUTORES");
                System.out.println("2 = CLIENTES");
                System.out.println("3 = EDITORIALES");
                System.out.println("4 = LIBROS");
                System.out.println("5 = PRESTAMOS");
                System.out.println("6 = VOLVER");
                System.out.println("---------------");
                System.out.println("INGRESE LA OPCION DESEADA.....");
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("LISTADO DE AUTORES");
                        System.out.println("---------------");
                        servAutor.listarAutores();
                        System.out.println("---------------");
                        System.out.println("Pulse enter para Continuar...");
                        pausa = leer.next();
                        break;
                    case 2:
                        System.out.println("LISTADO DE CLIENTES");
                        System.out.println("---------------");
                        System.out.println("Ingrese el Documento del Cliente");
                        System.out.println("Ingrese el Nombre del Cliente");
                        System.out.println("Ingrese el Apellido del Cliente");
                        System.out.println("Ingrese el Telefono del Cliente");
                        System.out.println("Cliente Guardado con Exito pulse enter para Continuar...");
                        pausa = leer.next();
                        break;
                    case 3:
                        System.out.println("LISTADO DE EDITORIALES");
                        System.out.println("---------------");
                        servEditorial.listarEditoriales();
                        System.out.println("---------------");
                        System.out.println("Pulse enter para Continuar...");
                        pausa = leer.next();
                        break;
                    case 4:
                        System.out.println("LISTADO DE LIBROS");
                        System.out.println("---------------");
                        
                        break;
                    case 5:
                        System.out.println("LISTADO DE PRESTAMOS");
                        System.out.println("---------------");
                        
                        break;
                    case 6:
                        System.out.println("---------------");
                        break;
                    default:
                        System.out.println("El numero ingresado es Incorrecto");
                }

            } while (opc !=6 );


        } catch (Exception e) {
        }
    }
}
