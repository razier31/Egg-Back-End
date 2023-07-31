
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Libro;

public class LibroDAO extends DAO<Libro>{
    
    @Override
    public void editar(Libro objeto) {
        super.editar(objeto); 
    }

    @Override
    public void guardar(Libro objeto) {
        super.guardar(objeto); 
    }
       
    
    public Libro buscarPorNombre (String titulo){
        try {
            conectar();
            Libro libro = (Libro)em.createQuery("SELECT l "
                + "FROM Libro l "
                + "WHERE l.titulo LIKE :titulo").setParameter("titulo", titulo).getSingleResult();
            desconectar();
            return libro;
        } catch (Exception e) {
            Libro libro = new Libro();
            return libro;
        }
    }
    
    public List<Libro> listarTodos() {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.alta = 1")
                .getResultList();
        desconectar();
        return libros;
    }
    
    public List<Libro> listarEliminados() {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.alta = 0")
                .getResultList();
        desconectar();
        return libros;
    }
}
