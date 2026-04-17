package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.EcoMarketSPA.model.HorarioTienda;


@Repository
public class HorarioTiendaRepository {
    //Lista para guardar Horarios
    private List<HorarioTienda>horarios=new ArrayList<>();

    //OBTNENER TODOS
    public List<HorarioTienda> obtenerHorarioTiendas(){
        return horarios;
    }

    //BUSCAR X id_horario
    public HorarioTienda buscarHorarioTienda(int id_horario){
        for (HorarioTienda hor : horarios) {
            if (hor.getId_horario() == id_horario) {
                return hor;
            }
        }
        return null;
    }

    // ELIMINAR POR ID
    public int eliminarHorario(int id_horario) {
        for (int i = 0; i < horarios.size(); i++) {
            if (horarios.get(i).getId_horario() == id_horario) {
                horarios.remove(i);
                return 1;
            }
        }
        return 0;
    }

    // GUARDAR horario
    public HorarioTienda guardarHorarioTienda(HorarioTienda horario) {
        horarios.add(horario);
        return horario;
    }

    // MODIFICAR horario
    public int modificarHorario(HorarioTienda horario) {
    try {
        for (int i = 0; i < horarios.size(); i++) {
            if (horarios.get(i).getId_horario() == horario.getId_horario()) {
                horarios.get(i).setDia_semana(horario.getDia_semana());
                horarios.get(i).setHora_apertura(horario.getHora_apertura());
                horarios.get(i).setHora_cierre(horario.getHora_cierre());
                return 1; // modificado
            }
        }
        return 0; // no encontrado
    } catch (Exception e) {
        return -1; // error
    }
    }
}
