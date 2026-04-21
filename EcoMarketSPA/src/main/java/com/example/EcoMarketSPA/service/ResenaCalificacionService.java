package com.example.EcoMarketSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcoMarketSPA.model.ResenaCalificacion;
import com.example.EcoMarketSPA.repository.ResenaCalificacionRepository;

@Service
public class ResenaCalificacionService {
    @Autowired
    private ResenaCalificacionRepository resenaCalificacionRepository;

    //obtener
    public List<ResenaCalificacion> getResenaCalificaciones(){
        return resenaCalificacionRepository.obtenerResenaCalificacion();
    }
    //bucar
    public ResenaCalificacion getResenaCalificacion(int id_resena_calificacion){
        return resenaCalificacionRepository.buscarResenaCalificacion(id_resena_calificacion);
    }
    //eliminar
    public int deleteResenaCalificacion(int id_resena_calificacion){
        return resenaCalificacionRepository.eliminarResena(id_resena_calificacion);
    }
    //guardar
    public ResenaCalificacion saveResenaCalificacion(ResenaCalificacion resenaCalificacion){
        return resenaCalificacionRepository.guardarResenaCalificacion(resenaCalificacion);
    }
    //modificar
    public int updateResenaCalificacion(ResenaCalificacion resenaCalificacion){
        return resenaCalificacionRepository.modificarResena(resenaCalificacion);
    }


}
