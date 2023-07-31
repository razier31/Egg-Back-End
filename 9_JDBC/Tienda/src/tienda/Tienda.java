package tienda;

import java.util.Scanner;
import servicios.FabricanteServicio;
import servicios.ProductoServicio;

/**
 *
 * @author Ramiro
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String pausa;
        int opc = 1;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ProductoServicio servPro = new ProductoServicio();
        FabricanteServicio servFab = new FabricanteServicio();
        
        do {
            System.out.println("MENU");
            System.out.println("--------------");
            System.out.println("1 - Listar Nombre de Todos los Productos");
            System.out.println("2 - Listar Nombre y Precios de Todos los Productos");
            System.out.println("3 - Productos con precio entre 120 y 202.");
            System.out.println("4 - Todos los Portátiles de la tabla producto");
            System.out.println("5 - Producto Mas Barato");
            System.out.println("6 - Guardar Nuevo Producto");
            System.out.println("7 - Guardar Nuevo Fabricante");
            System.out.println("8 - Editar Producto Existente");
            System.out.println("0 - SALIR");
            System.out.println("--------------");
            System.out.println("Ingrese la opcion deseada");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    servPro.listarNombres();
                    System.out.println("Teclear enter para Continuar");
                    pausa = leer.next();
                    break;
                case 2:
                    servPro.listarNombresPrecios();
                    System.out.println("Teclear enter para Continuar");
                    pausa = leer.next();
                    break;
                case 3:
                    servPro.listarEntrePrecios();
                    System.out.println("Teclear enter para Continuar");
                    pausa = leer.next();
                    break;
                case 4:
                    servPro.listarPortatiles();
                    System.out.println("Teclear enter para Continuar");
                    pausa = leer.next();
                    break;
                case 5:
                    servPro.masBarato();
                    System.out.println("Teclear enter para Continuar");
                    pausa = leer.next();
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                   break;
                default:
                    throw new AssertionError();
            }
        } while (opc != 0);
        
    }
    
}
