package com.example.EcoMarketSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcoMarketSPA.model.ResenaCalificacion;
import com.example.EcoMarketSPA.repository.ResenaCalificacionRepository;

@Service
@Transactional
public class ResenaCalificacionService {
    @Autowired
    private ResenaCalificacionRepository resenaCalificacionRepository;

    //obtener
    public List<ResenaCalificacion> getResenaCalificaciones(){
        return resenaCalificacionRepository.obtenerResenaCalificacion();
    }
    //bucar
    public ResenaCalificacion getResenaCalificacion(int id_resena_calificacion){
        ResenaCalificacion resenaCalificacion = resenaCalificacionRepository.buscarResenaCalificacion(id_resena_calificacion);
        if (resenaCalificacion!=null) {
            return resenaCalificacion;
        }else
        return new ResenaCalificacion();
    }
    //eliminar
    public int deleteResenaCalificacion(int id_resena_calificacion){
        resenaCalificacionRepository.eliminarResenaCalificacion(id_resena_calificacion);
        return 1;
    }
    //guardar
    public ResenaCalificacion saveResenaCalificacion(ResenaCalificacion resenaCalificacion){
        return resenaCalificacionRepository.save(resenaCalificacion);
    }
    //modificar
    public int updateResenaCalificacion(ResenaCalificacion resenaCalificacion){
        resenaCalificacionRepository.save(resenaCalificacion);
        return 1;
    }


}
