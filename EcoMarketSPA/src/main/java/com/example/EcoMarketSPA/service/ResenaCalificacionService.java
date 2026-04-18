package com.example.EcoMarketSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.EcoMarketSPA.model.ResenaCalificacion;
import com.example.EcoMarketSPA.repository.ResenaCalificacionRepository;


public class ResenaCalificacionService {
    @Autowired
    private ResenaCalificacionRepository resenaCalificacionRepository;

    //obtener
    public List<ResenaCalificacion> getResenaCalificaciones(){
        return resenaCalificacionRepository.getResenaCalificaciones();
    }
    //bucar
    public ResenaCalificacion getResenaCalificacion(int id_resena_calificacion){
        return resenaCalificacionRepository.buscarResenaCalificacion(id_resena_calificacion);
    }
    //eliminar
    public int deleteResenaCalificacion(int id_resena_calificacion){
        return resenaCalificacionRepository.eliminarResenaCalificacion(id_resena_calificacion);
    }
    //guardar
    public ResenaCalificacion saveResenaCalificacion(ResenaCalificacion resenaCalificacion){
        return resenaCalificacionRepository.guardarResenaCalificacion(resenaCalificacion);
    }
    //modificar
    public ResenaCalificacion updateResenaCalificacion(ResenaCalificacion resenaCalificacion){
        return resenaCalificacionRepository.modificarResenaCalificacion(resenaCalificacion);
    }


}
