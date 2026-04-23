package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.EcoMarketSPA.model.HorarioTienda;


@Repository
public interface HorarioTiendaRepository extends JpaRepository<HorarioTienda, Integer> {
    
    @Query("SELECT h FROM HorarioTienda h")
    List<HorarioTienda> obtenerHorarioTiendas();

    @Query("SELECT h FROM HorarioTienda h WHERE h.id_horario_tienda = :id_horario_tienda")
    HorarioTienda buscarHorarioTienda(int id_horario_tienda);
    
}
