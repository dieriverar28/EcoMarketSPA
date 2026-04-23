package com.example.EcoMarketSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcoMarketSPA.model.Comuna;
import com.example.EcoMarketSPA.repository.ComunaRepository;

@Service
public class ComunaService {
    @Autowired
//SE LLAMA AL REPOSITORIO PARA PODER USAR SUS FUNCIONES
    private ComunaRepository comunaRepository; 

//OBTENER COMUNAS
    public List<Comuna> getComunas() {
        return comunaRepository.obtenerComunas();
    }
//OBTENER COMUNA POR ID
    public Comuna getComunaById(int id_comuna) {
        return comunaRepository.buscarComuna(id_comuna);
    }
//CREAR comuna
    public Comuna saveComunas(Comuna comuna) {
        return comunaRepository.guardarComuna(comuna);
    }
//ACTUALIZAR comuna
    public int updateComuna(Comuna comuna) {
        return comunaRepository.modificarComuna(comuna);
    }
//ELIMINAR comuna
    public int deleteComuna(int id_comuna) {
        return comunaRepository.eliminarComuna(id_comuna);
    }
}


