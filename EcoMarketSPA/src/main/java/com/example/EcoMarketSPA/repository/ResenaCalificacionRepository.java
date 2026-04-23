package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.EcoMarketSPA.model.ResenaCalificacion;


@Repository
public class ResenaCalificacionRepository {
    //Lista para guardar ReseñasCalificacion
    private List<ResenaCalificacion>resenas=new ArrayList<>();

    //OBTNENER TODOS
    public List<ResenaCalificacion> obtenerResenaCalificacion(){
        return resenas;
    }

    //BUSCAR X id_resena
    public ResenaCalificacion buscarResenaCalificacion(int id_resena){
        for (ResenaCalificacion rc : resenas) {
            if (rc.getId_resena() == id_resena) {
                return rc;
            }
        }
        return null;
    }

     // ELIMINAR POR ID
    public int eliminarResena(int id_resena) {
        for (int i = 0; i < resenas.size(); i++) {
            if (resenas.get(i).getId_resena() == id_resena) {
                resenas.remove(i);
                return 1;
            }
        }
        return 0;
    }

    // GUARDAR reseña
    public ResenaCalificacion guardarResenaCalificacion(ResenaCalificacion resena) {
        resenas.add(resena);
        return resena;
    }

    // MODIFICAR resena
    public int modificarResena(ResenaCalificacion resena) {
    try {
        for (int i = 0; i < resenas.size(); i++) {
            if (resenas.get(i).getId_resena() == resena.getId_resena()) {
                resenas.get(i).setMotivo(resena.getMotivo());;
                resenas.get(i).setEstado(false);;
                resenas.get(i).setFecha(null);
                return 1; // modificado
            }
        }
        return 0; // no encontrado
    } catch (Exception e) {
        return -1; // error
    }
    }
}
