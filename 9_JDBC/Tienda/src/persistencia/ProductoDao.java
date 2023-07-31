package persistencia;

import entidades.Producto;
import java.util.ArrayList;
import java.util.Collection;


public final class ProductoDao extends DAO {
    public void guardarProducto(Producto datos) throws Exception{
        try {
            if (datos == null) {
                throw new Exception("Los datos del Producto no pueden estar Vacios");
            }
            String consulta = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante) VALUES ('"
                    +datos.getCodigo()+"', '"+datos.getNombre()+"', '"+datos.getPrecio()
                    +"', '"+datos.getCodigoFabricante()+"');";
            insertarModificarEliminar(consulta);
        } catch (Exception e) {
            throw e;
        }
    }
    public void modificarProducto(Producto datos) throws Exception{
        try {
            if (datos == null) {
                throw new Exception("Los datos del Producto a modificar no pueden estar Vacios");
            }
            String consulta = "UPDATE producto SET"
                    +"codigo ='"+datos.getCodigo()+"', nombre ='"+datos.getNombre()
                    +"', precio='"+datos.getPrecio()
                    +"', codigo_fabricante='"+datos.getCodigoFabricante()
                    +"'WHERE nombre ='"+datos.getNombre()+"';";
            insertarModificarEliminar(consulta);
        } catch (Exception e) {
            throw e;
        }
    }
    public Collection<Producto> listarProductosNomb() throws Exception{
        try {
            String consulta = "SELECT nombre FROM producto";
            
            consultarBaseDatos(consulta);
            
            Producto producto = null;
            Collection<Producto> listaPro = new ArrayList();
            
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                listaPro.add(producto);
            }
            desconectarBase();
            return listaPro;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    public Collection<Producto> listarProductosNombPrec() throws Exception{
        try {
            String consulta = "SELECT nombre, precio FROM producto";
            
            consultarBaseDatos(consulta);
            
            Producto producto = null;
            Collection<Producto> listaPro = new ArrayList();
            
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                listaPro.add(producto);
            }
            desconectarBase();
            return listaPro;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    public Collection<Producto> listarProductosEntrePrec() throws Exception{
        try {
            String consulta = "SELECT nombre, precio FROM producto WHERE precio > 120 AND precio < 202";
            
            consultarBaseDatos(consulta);
            
            Producto producto = null;
            Collection<Producto> listaPro = new ArrayList();
            
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                listaPro.add(producto);
            }
            desconectarBase();
            return listaPro;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    public Collection<Producto> listarProductosPortatil() throws Exception{
        try {
            String consulta = "SELECT nombre, precio FROM producto WHERE nombre LIKE '%portatil%'";
            
            consultarBaseDatos(consulta);
            
            Producto producto = null;
            Collection<Producto> listaPro = new ArrayList();
            
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                listaPro.add(producto);
            }
            desconectarBase();
            return listaPro;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    public Producto ProductoMasBarato() throws Exception{
        try {
            String consulta = "SELECT nombre, precio FROM producto WHERE precio = (SELECT MIN(precio) FROM producto)";
            
            consultarBaseDatos(consulta);
            
            Producto producto = null;
                        
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
}
