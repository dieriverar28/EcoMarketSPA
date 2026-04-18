package com.example.EcoMarketSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.EcoMarketSPA.model.RutaEntrega;
import com.example.EcoMarketSPA.repository.RutaEntregaRepository;

public class RutaEntregaService {
    @Autowired
    private RutaEntregaRepository rutaEntregaRepository;
    //obtener
    public List<RutaEntrega> getRutaEntregas(){
        return rutaEntregaRepository.obtenerRutaEntregas();
    }
    //bucar
    public RutaEntrega getRutaEntrega(int id_ruta_entrega){
        return rutaEntregaRepository.buscarRutaEntrega(id_ruta_entrega);
    }
    //eliminar
    public int deleteRutaEntrega(int id_ruta_entrega){
        return rutaEntregaRepository.eliminarRutaEntrega(id_ruta_entrega);
    }
    //buardar
    public RutaEntrega saveRutaEntrega(RutaEntrega rutaEntrega){
        return rutaEntregaRepository.guardarRutaEntrega(rutaEntrega)
    }
    //modificar
    public RutaEntrega updateRutaEntrega(RutaEntrega rutaEntrega){
        return rutaEntregaRepository.modificarRuta(rutaEntrega)
    }


}
