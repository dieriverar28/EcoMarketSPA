package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.EcoMarketSPA.model.Region;


@Repository
public class RegionRepository {
    //Lista para guardar regiones

    private List<Region>regiones=new ArrayList<>();

    //OBTNENER TODOS
    public List<Region> obtenerRegiones(){
        return regiones;
    }

    //BUSCAR X id_region
    public Region buscarRegion(int id_region){
        for (Region re : regiones) {
            if (re.getId_region() == id_region) {
                return re;
            }
        }
        return null;
    }

    // ELIMINAR POR ID
    public int eliminarRegion(int id_region) {
        for (int i = 0; i < regiones.size(); i++) {
            if (regiones.get(i).getId_region() == id_region) {
                regiones.remove(i);
                return 1;
            }
        }
        return 0;
    }

    // GUARDAR region
    public Region guardarRegion(Region region) {
        regiones.add(region);
        return region;
    }

    // MODIFICAR region
    public int modificarRegion(Region region) {
    try {
        for (int i = 0; i < regiones.size(); i++) {
            if (regiones.get(i).getId_region() == region.getId_region()) {
                regiones.get(i).setNombre(region.getNombre());
                return 1; // modificado
            }
        }
        return 0; // no encontrado
    } catch (Exception e) {
        return -1; // error
    }
    }

}
