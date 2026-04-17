package com.example.EcoMarketSPA.model;

import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //se conecta con entidad
@Table(name="horariotienda") //la tabla nombre persona
@Data //antes de data ahora va lo de arriba
@AllArgsConstructor
@NoArgsConstructor

public class HorarioTienda {
    @Id
    private int id_horario;//pk
    private int id_tienda;//fk
    @Column(name="dia_semana", nullable =false)
    private String dia_semana;
    private Time hora_apertura;
    private Time hora_cierre;
}
