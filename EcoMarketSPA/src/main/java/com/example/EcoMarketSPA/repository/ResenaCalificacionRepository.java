package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.EcoMarketSPA.model.ResenaCalificacion;


@Repository
public interface ResenaCalificacionRepository extends JpaRepository<ResenaCalificacion, Integer> {
    
    @Query("SELECT r FROM ResenaCalificacion r")
    List<ResenaCalificacion> obtenerResenaCalificacion();

    @Query("SELECT r FROM ResenaCalificacion r WHERE r.id_resena_calificacion = :id_resena_calificacion")
    ResenaCalificacion buscarResenaCalificacion(int id_resena_calificacion);
}
