package com.example.EcoMarketSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcoMarketSPA.model.Tienda;
import com.example.EcoMarketSPA.repository.TiendaRepository;




@Service
public class TiendaService {
    @Autowired
    private TiendaRepository tiendaRepository;
    //obtener
    public List<Tienda> getTiendas(){
        return tiendaRepository.obtenerTienda();
    }
    //bucar
    public Tienda getTienda(int id_tienda){
        return tiendaRepository.buscarTienda(id_tienda);
    }
    //eliminar
    public int deleteTienda(int id_tienda){
        return tiendaRepository.eliminarTienda(id_tienda);
    }
    //buardar
    public Tienda saveTienda(Tienda tienda){
        return tiendaRepository.guardarTienda(tienda);
    }
    //modificar
    public int updateTienda(Tienda tienda){
        return tiendaRepository.modificarTienda(tienda);
    }


}
