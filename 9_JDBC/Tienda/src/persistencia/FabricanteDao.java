package persistencia;

import entidades.Fabricante;

public final class FabricanteDao extends DAO{
    public void guardarFabricante(Fabricante datos) throws Exception{
        try {
            if (datos == null) {
                throw new Exception("Los datos del Fabricante no pueden estar Vacios");
            }
            String consulta = "INSERT INTO fabricante (codigo, nombre) VALUES ('"
                    +datos.getCodigo()+"', '"+datos.getNombre()+"');";
            insertarModificarEliminar(consulta);
        } catch (Exception e) {
            throw e;
        }
    }
}
