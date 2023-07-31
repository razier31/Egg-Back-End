
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Editorial;

public class EditorialDAO extends DAO<Editorial> {
    
    @Override
    public void editar(Editorial objeto) {
        super.editar(objeto); 
    }

    @Override
    public void guardar(Editorial objeto) {
        super.guardar(objeto); 
    }
       
    
    public Editorial buscarPorNombre (String nombre){
        try {
            conectar();
            Editorial editorial = (Editorial)em.createQuery("SELECT e "
                + "FROM Editorial e "
                + "WHERE e.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
            desconectar();
            return editorial;
        } catch (Exception e) {
            Editorial editorial = new Editorial();
            return editorial;
        }
    }
    
    public List<Editorial> listarTodos() {
        conectar();
        List<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e WHERE e.alta = 1")
                .getResultList();
        desconectar();
        return editoriales;
    }
    
    public List<Editorial> listarEliminados() {
        conectar();
        List<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e WHERE e.alta = 0")
                .getResultList();
        desconectar();
        return editoriales;
    }
}
