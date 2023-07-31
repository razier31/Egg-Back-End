package servicios;

import entidades.Producto;
import java.util.ArrayList;
import java.util.Collection;
import persistencia.ProductoDao;

public class ProductoServicio {
    private ProductoDao dao;

    public ProductoServicio() {
        this.dao = new ProductoDao();
    }
    
    public void listarNombres() throws Exception{
        Collection<Producto> lista = new ArrayList(); 
        lista = dao.listarProductosNomb();
        for (Producto producto : lista) {
            System.out.println(producto.getNombre());
        }
    }
    
    public void listarNombresPrecios() throws Exception{
        Collection<Producto> lista = new ArrayList(); 
        lista = dao.listarProductosNombPrec();
        for (Producto producto : lista) {
            System.out.println(producto.getNombre()+" /  $ "+producto.getPrecio());
        }
    }
    public void listarEntrePrecios() throws Exception{
        Collection<Producto> lista = new ArrayList(); 
        lista = dao.listarProductosEntrePrec();
        for (Producto producto : lista) {
            System.out.println(producto.getNombre()+" /  $ "+producto.getPrecio());
        }
    }
    public void listarPortatiles() throws Exception{
        Collection<Producto> lista = new ArrayList(); 
        lista = dao.listarProductosPortatil();
        for (Producto producto : lista) {
            System.out.println(producto.getNombre()+" /  $ "+producto.getPrecio());
        }
    }
    public void masBarato() throws Exception{
        Producto producto = new Producto(); 
        producto = dao.ProductoMasBarato();
        System.out.println(producto.getNombre()+" /  $ "+producto.getPrecio());
    }
    public void guardar(Integer codigo, String nombre, Double precio, Integer codigofa) throws Exception{
        try {
            if (nombre == null) {
                throw new Exception("El nombre no puede estar vacio");
            }
            if (codigo == null) {
                throw new Exception("El codigo no puede estar vacio");
            }
            Producto newProducto = new Producto(codigo, nombre, precio, codigofa);
            dao.guardarProducto(newProducto);
        } catch (Exception e) {
            throw e;
        }
    }  
}
