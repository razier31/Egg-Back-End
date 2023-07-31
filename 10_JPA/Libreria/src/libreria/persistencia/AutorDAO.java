
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;

public class AutorDAO extends DAO<Autor>{

    @Override
    public void editar(Autor objeto) {
        super.editar(objeto); 
    }

    @Override
    public void guardar(Autor objeto) {
        super.guardar(objeto); 
    }
       
    
    public Autor buscarPorNombre (String nombre){
        try {
            conectar();
            Autor autor = (Autor)em.createQuery("SELECT a "
                + "FROM Autor a "
                + "WHERE a.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
            desconectar();
            return autor;
        } catch (Exception e) {
            Autor editorial = new Autor();
            return editorial;
        }
    }
    
    public List<Autor> listarTodos() {
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a WHERE a.alta = 1")
                .getResultList();
        desconectar();
        return autores;
    }
    
    public List<Autor> listarEliminados() {
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a WHERE a.alta = 0")
                .getResultList();
        desconectar();
        return autores;
    }
}
