package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.EcoMarketSPA.model.RutaEntrega;

@Repository
public class RutaEntregaRepository {
    //Lista para ruta entrega
    private List<RutaEntrega>rutaentregas=new ArrayList<>();

    //OBTNENER TODOS
    public List<RutaEntrega> obtenerRutaEntrega(){
        return rutaentregas;
    }

    //BUSCAR X id_ruta
    public RutaEntrega buscarRutaEntrega(int id_ruta){
        for (RutaEntrega re : rutaentregas) {
            if (re.getId_ruta() == id_ruta) {
                return re;
            }
        }
        return null;
    }

    // ELIMINAR POR ID
    public int eliminarRutaEntrega(int id_ruta) {
        for (int i = 0; i < rutaentregas.size(); i++) {
            if (rutaentregas.get(i).getId_ruta() == id_ruta) {
                rutaentregas.remove(i);
                return 1;
            }
        }
        return 0;
    }

    // GUARDAR ruta
    public RutaEntrega guardarRutaEntrega(RutaEntrega rutaentrega) {
        rutaentregas.add(rutaentrega);
        return rutaentrega;
    }

    // MODIFICAR ruta
    public int modificarRuta(RutaEntrega rutaentrega) {
    try {
        for (int i = 0; i < rutaentregas.size(); i++) {
            if (rutaentregas.get(i).getId_ruta() == rutaentrega.getId_ruta()) {
                rutaentregas.get(i).setNombre(rutaentrega.getNombre());
                rutaentregas.get(i).setDescripcion(rutaentrega.getDescripcion());
                rutaentregas.get(i).setTipo(rutaentrega.getTipo());
                return 1; // modificado
            }
        }
        return 0; // no encontrado
    } catch (Exception e) {
        return -1; // error
    }
    }
}

