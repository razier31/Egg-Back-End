/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales. Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:
1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.
2) Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.
3) Método ordenar recibe un arreglo por parámetro y lo ordena de
mayor a menor.
4) Método inicializarB copia los primeros 10 números del arreglo A en el
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B.
 */
package u9ejercicio3;

import Servicio.ArregloService;

/**
 *
 * @author Ramiro
 */
public class U9Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double[] A = new Double[50];
        Double[] B = new Double[20];
        ArregloService serv = new ArregloService();
        
        serv.inicializarA(A);
        serv.mostrar(A);
        serv.ordenar(A);
        serv.inicializarB(A, B);
        serv.mostrar(A);
        serv.mostrar(B);
    }
    
}
