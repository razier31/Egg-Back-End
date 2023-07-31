
package libreria.servicios;

import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.AutorDAO;
import libreria.persistencia.EditorialDAO;
import libreria.persistencia.LibroDAO;


public class LIbroServicio {
    private LibroDAO dao;
    private AutorDAO daoA;
    private EditorialDAO daoE;

    public LIbroServicio() {
        this.dao = new LibroDAO();
        this.daoA = new AutorDAO();
        this.daoE = new EditorialDAO();
    }

    public void altaLibro(long isbn, String titulo, Integer anio, Integer ejemplares, String nomautor, String nomeditorial) throws Exception{
        try {
//            if (titulo.equals(buscarAutorNombre(titulo).getNombre())) {
//                throw new Exception("Ese Nombre ya existe en la Base de Datos");
//            }
            if (titulo == null || titulo.trim().isEmpty() ) {
                throw new Exception("El titulo no puede estar vacio");
            }
            Autor autor = daoA.buscarPorNombre(nomautor);
            if (autor.getNombre().isEmpty()) {
                System.out.println("No se Encontro el Autor creando uno Nuevo...");
                autor = new Autor(nomautor);
                daoA.guardar(autor);
            }
            Editorial editorial = daoE.buscarPorNombre(nomeditorial);
            if (editorial.getNombre().isEmpty()) {
                System.out.println("No se Encontro la Editorial creando una Nueva...");
                editorial = new Editorial(nomeditorial);
                daoE.guardar(editorial);
            }
            Libro newLibro = new Libro(isbn, titulo, anio, ejemplares, autor, editorial);
            dao.guardar(newLibro);
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
//    
//    public void bajaAutor(String autor) throws Exception{
//        
//        try {
//
//            if (autor == null || autor.trim().isEmpty() ) {
//                throw new Exception("El nombre no puede estar vacio");
//            }
//            Autor modAutor = buscarAutorNombre(autor);
//            
//            if (modAutor.getNombre().isEmpty()) {
//                throw new Exception("No se encontro el nombre en la base de Datos");
//            }
//            
//            modAutor.setAlta(false);
//            dao.editar(modAutor);
//        } catch (Exception e) {
//            throw e;
//        }
//    }
//    
//    public Autor buscarAutorNombre(String nombre){
//        try {
//            Autor resultado = dao.buscarPorNombre(nombre);
//            return resultado;
//        } catch (Exception e) {
//            throw e;
//        }
//    }
//    
//    public void listarAutores(){
//        try {
//            List<Autor> autores = dao.listarTodos();
//            for (Autor autor : autores) {
//                System.out.println(autor);
//            }
//        } catch (Exception e) {
//            throw e;
//        }
//    }
//    
//    public void papelera(){
//        try {
//            List<Autor> autores = dao.listarEliminados();
//            for (Autor autor : autores) {
//                System.out.println(autor);
//            }
//        } catch (Exception e) {
//            throw e;
//        }
//    }    
}
