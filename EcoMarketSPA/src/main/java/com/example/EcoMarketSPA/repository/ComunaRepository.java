package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.example.EcoMarketSPA.model.Comuna;

@Repository
public class ComunaRepository {
    //Lista para guardar comuna
    private List<Comuna>comunas=new ArrayList<>();
    
    //OBTNENER TODOS
    public List<Comuna> obtenerComunas(){
        return comunas;
    }
    //BUSCAR X id_comuna
    public Comuna buscarComuna(int id_comuna){
        for (Comuna co : comunas) {
            if (co.getId_comuna() == id_comuna) {
                return co;
            }
        }
        return null;
    }
    // ELIMINAR POR ID
    public int eliminarComuna(int id_comuna) {
        for (int i = 0; i < comunas.size(); i++) {
            if (comunas.get(i).getId_comuna() == id_comuna) {
                comunas.remove(i);
                return 1;
            }
        }
        return 0;
    }
    // GUARDAR COMUNA
    public Comuna guardarComuna(Comuna comuna) {
        comunas.add(comuna);
        return comuna;
    }
    // MODIFICAR COMUNA
    public int modificarComuna(Comuna comuna) {
    try {
        for (int i = 0; i < comunas.size(); i++) {
            if (comunas.get(i).getId_comuna() == comuna.getId_comuna()) {
                comunas.get(i).setNombre(comuna.getNombre());
                return 1; // modificado
            }
        }
        return 0; // no encontrado
    } catch (Exception e) {
        return -1; // error
    }
    }
}
