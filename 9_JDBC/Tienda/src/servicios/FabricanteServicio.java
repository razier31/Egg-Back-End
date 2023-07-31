package servicios;

import entidades.Fabricante;
import persistencia.FabricanteDao;

public class FabricanteServicio {
    private FabricanteDao dao;

    public FabricanteServicio() {
        this.dao = new FabricanteDao();
    }
    
    public void guardar(Integer codigo, String nombre) throws Exception{
        try {
            if (nombre == null) {
                throw new Exception("El nombre no puede estar vacio");
            }
            if (codigo == null) {
                throw new Exception("El codigo no puede estar vacio");
            }
            Fabricante newFabricante = new Fabricante(codigo, nombre);
            dao.guardarFabricante(newFabricante);
        } catch (Exception e) {
            throw e;
        }
    }    
}
