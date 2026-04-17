package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.EcoMarketSPA.model.Envio;

@Repository

public class EnvioRepository {
    //Lista para guardar envio
    private List<Envio>envios=new ArrayList<>();

    //OBTNENER TODOS
    public List<Envio> obtenerEnvios(){
        return envios;
    }

    //BUSCAR X id_envio
    public Envio buscarEnvio(int id_envio){
        for (Envio env : envios) {
            if (env.getId_envio() == id_envio) {
                return env;
            }
        }
        return null;
    }

    // ELIMINAR POR ID
    public int eliminarEnvio(int id_envio) {
        for (int i = 0; i < envios.size(); i++) {
            if (envios.get(i).getId_envio() == id_envio) {
                envios.remove(i);
                return 1;
            }
        }
        return 0;
    }

    // GUARDAR envio
    public Envio guardarCupon(Envio envio) {
        envios.add(envio);
        return envio;
    }

    // MODIFICAR envio
    public int modificarEnvio(Envio envio) {
    try {
        for (int i = 0; i < envios.size(); i++) {
            if (envios.get(i).getId_envio() == envio.getId_envio()) {
                envios.get(i).setEstado(false);
                envios.get(i).setFecha_despacho(envio.getFecha_despacho());
                envios.get(i).setFecha_entrega_est(envio.getFecha_entrega_est());
                
                return 1; // modificado
            }
        }
        return 0; // no encontrado
    } catch (Exception e) {
        return -1; // error
    }
    }
}
