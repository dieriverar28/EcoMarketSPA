package com.example.EcoMarketSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcoMarketSPA.model.Boleta;
import com.example.EcoMarketSPA.repository.BoletaRepository;

@Service
public class BoletaService {
    @Autowired
//SE LLAMA AL REPOSITORIO PARA PODER USAR SUS FUNCIONES
    private BoletaRepository boletaRepository; 

//OBTENER TODAS LAS BOLETAS
    public List<Boleta> getAllBoletas() {
        return boletaRepository.obtenerBoletas();
    }
//OBTENER BOLETA POR ID
    public Boleta getBoletaById(int id_boleta) {
        return boletaRepository.buscarBoleta(id_boleta);
    }
//CREAR BOLETA
    public Boleta saveBoletas(Boleta boleta) {
        return boletaRepository.guardarBoleta(boleta);
    }
//ACTUALIZAR BOLETA
    public int updateBoleta(Boleta boleta) {
        return boletaRepository.modificarBoleta(boleta);
    }
//ELIMINAR BOLETA
    public int deleteBoleta(int id_boleta) {
        return boletaRepository.eliminarBoleta(id_boleta);
    }

}
