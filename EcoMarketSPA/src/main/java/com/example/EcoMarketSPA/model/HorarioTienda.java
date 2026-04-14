package com.example.EcoMarketSPA.model;

import java.sql.Time;

public class HorarioTienda {
    private int id_horario;//pk
    private int id_tienda;//fk
    private String dia_semana;
    private Time hora_apertura;
    private Time hora_cierre;
}
