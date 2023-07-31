
package libreria.servicios;

import java.util.List;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;


public class AutorServicio {
    private AutorDAO dao;

    public AutorServicio() {
        this.dao = new AutorDAO();
    }
    
    public void altaAutor(String nombre) throws Exception{
        try {
            if (nombre.equals(buscarAutorNombre(nombre).getNombre())) {
                throw new Exception("Ese Nombre ya existe en la Base de Datos");
            }
            if (nombre == null || nombre.trim().isEmpty() ) {
                throw new Exception("El nombre no puede estar vacio");
            }
            Autor newAutor = new Autor(nombre);
            dao.guardar(newAutor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
    
    public void modificarAutor(String autor, String nuevo) throws Exception{
        
        try {

            if (autor == null || autor.trim().isEmpty() ) {
                throw new Exception("El nombre no puede estar vacio");
            }
            Autor modAutor = buscarAutorNombre(autor);
            
            if (modAutor.getNombre().isEmpty()) {
                throw new Exception("No se encontro el nombre en la base de Datos");
            }
            modAutor.setNombre(nuevo);
            dao.editar(modAutor);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void bajaAutor(String autor) throws Exception{
        
        try {

            if (autor == null || autor.trim().isEmpty() ) {
                throw new Exception("El nombre no puede estar vacio");
            }
            Autor modAutor = buscarAutorNombre(autor);
            
            if (modAutor.getNombre().isEmpty()) {
                throw new Exception("No se encontro el nombre en la base de Datos");
            }
            
            modAutor.setAlta(false);
            dao.editar(modAutor);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Autor buscarAutorNombre(String nombre){
        try {
            Autor resultado = dao.buscarPorNombre(nombre);
            return resultado;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void listarAutores(){
        try {
            List<Autor> autores = dao.listarTodos();
            for (Autor autor : autores) {
                System.out.println(autor);
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void papelera(){
        try {
            List<Autor> autores = dao.listarEliminados();
            for (Autor autor : autores) {
                System.out.println(autor);
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
