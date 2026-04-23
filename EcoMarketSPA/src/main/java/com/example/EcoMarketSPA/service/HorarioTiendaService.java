package com.example.EcoMarketSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcoMarketSPA.model.HorarioTienda;
import com.example.EcoMarketSPA.repository.HorarioTiendaRepository;


@Service
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
    public int deleteHorarioTienda(int id_horario_tienda){
        return horarioTiendaRepository.eliminarHorario(id_horario_tienda);
    }
    //guardadr por id 
    public HorarioTienda saveHorarioTienda(HorarioTienda horariotienda){
        return horarioTiendaRepository.guardarHorarioTienda(horariotienda);
    }
    //modificar por id 
    public int  updateHorarioTienda(HorarioTienda horario){
        return horarioTiendaRepository.modificarHorario(horario);
    }

    }

