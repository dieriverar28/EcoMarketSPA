package com.example.EcoMarketSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcoMarketSPA.model.RutaEntrega;
import com.example.EcoMarketSPA.repository.RutaEntregaRepository;



@Service
@Transactional
public class RutaEntregaService {
    @Autowired
    private RutaEntregaRepository rutaEntregaRepository;
    //obtener
    public List<RutaEntrega> getRutaEntregas(){
        return rutaEntregaRepository.obtenerRutaEntrega();
    }
    //bucar
    public RutaEntrega getRutaEntrega(int id_ruta_entrega){
        RutaEntrega rutaEntregas = rutaEntregaRepository.buscarRutaEntrega(id_ruta_entrega);
        if (rutaEntregas!=null) {
            return rutaEntregas;
        }else
        return new RutaEntrega();
    }
    //eliminar
    public int deleteRutaEntrega(int id_ruta_entrega){
        rutaEntregaRepository.delete(getRutaEntrega(id_ruta_entrega));
        return 1;
    }
    //buardar
    public RutaEntrega saveRutaEntrega(RutaEntrega rutaEntrega){
        return rutaEntregaRepository.save(rutaEntrega);
    }
    //modificar
    public int updateRutaEntrega(RutaEntrega rutaEntrega){
        rutaEntregaRepository.save(rutaEntrega);
        return 1;
    }


}
