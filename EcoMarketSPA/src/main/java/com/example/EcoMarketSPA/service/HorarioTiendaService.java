package com.example.EcoMarketSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.EcoMarketSPA.model.HorarioTienda;
import com.example.EcoMarketSPA.repository.HorarioTiendaRepository;

public class HorarioTiendaService {
    @Autowired
    //
    private HorarioTiendaRepository horarioTiendaRepository;
    //obtenre todos
    public List<HorarioTienda> getHorarioTienda(){
        return horarioTiendaRepository.obtenerHorarioTiendas();
    }
    //buscar por id 
    public HorarioTienda getHorarioTienda(int id_horario_tienda){
        return horarioTiendaRepository.buscarHorarioTienda(id_horario_tienda);
    }
    //eliminar por id
    public int delateHorarioTienda(int id_horario_tienda){
        return horarioTiendaRepository.eliminarHorario(id_horario_tienda);
    }
    //guardadr por id 
    public HorarioTienda saveHorarioTienda(HorarioTienda horariotienda){
        return horarioTiendaRepository.guardarHorarioTienda(horariotienda);
    }
    //modificar por id 
    public HorarioTienda updateHorarioTienda(HorarioTienda horarioTienda){
        return horarioTiendaRepository.modificarHorarioTienda(horarioTienda);
    }

    }

