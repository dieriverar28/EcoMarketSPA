package com.example.EcoMarketSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.EcoMarketSPA.model.Region;
import com.example.EcoMarketSPA.repository.RegionRepository;

public class RegionService {
    @Autowired
    private RegionRepository regionRepository;

    //obtener
    public List<Region> getRegiones(){
        return regionRepository.obtenerRegiones();
    }
    //bucar
    public Region getRegion(int id_region){
        return regionRepository.buscarRegion(id_region);
    }
    //eliminar
    public int deleteRegion(int id_region){
        return regionRepository.eliminarRegion(id_region);
    }
    //guardar
    public Region saveRegion(Region region){
        return regionRepository.guardarRegion(region);
    }
    //modificar
    public Region updateRegion(Region region){
        return regionRepository.modificarRegion(region);
    }



}
