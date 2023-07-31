
package libreria.servicios;

import java.util.List;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;


public class EditorialServicio {
    
    private EditorialDAO dao;

    public EditorialServicio() {
        this.dao = new EditorialDAO();
    }
    
    public void altaEditorial(String nombre) throws Exception{
        try {
            if (nombre.equals(buscarEditorialNombre(nombre).getNombre())) {
                throw new Exception("Ese Nombre ya existe en la Base de Datos");
            }
            if (nombre == null || nombre.trim().isEmpty() ) {
                throw new Exception("El nombre no puede estar vacio");
            }
            Editorial newEditorial = new Editorial(nombre);
            dao.guardar(newEditorial);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
    
    public void modificarEditorial(String editorial, String nuevo) throws Exception{
        
        try {

            if (editorial == null || editorial.trim().isEmpty() ) {
                throw new Exception("El nombre no puede estar vacio");
            }
            Editorial modEditorial = buscarEditorialNombre(editorial);
            if (modEditorial.getNombre().isEmpty()) {
                throw new Exception("No se encontro el nombre en la base de Datos");
            }
            modEditorial.setNombre(nuevo);
            dao.editar(modEditorial);
        } catch (Exception e) {
            System.out.println(e.getMessage());     
            throw e;
        }
    }
    
    public void bajaEditorial(String editorial) throws Exception{
        
        try {

            if (editorial == null || editorial.trim().isEmpty() ) {
                throw new Exception("El nombre no puede estar vacio");
            }
            Editorial modEditorial = buscarEditorialNombre(editorial);
            modEditorial.setAlta(false);
            dao.editar(modEditorial);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Editorial buscarEditorialNombre(String nombre){
        try {
            Editorial resultado = dao.buscarPorNombre(nombre);
            return resultado;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
    
    public void listarEditoriales(){
        try {
            List<Editorial> editoriales = dao.listarTodos();
            for (Editorial editorial : editoriales) {
                System.out.println(editorial);
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void papelera(){
        try {
            List<Editorial> editoriales = dao.listarEliminados();
            for (Editorial editorial : editoriales) {
                System.out.println(editorial);
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
