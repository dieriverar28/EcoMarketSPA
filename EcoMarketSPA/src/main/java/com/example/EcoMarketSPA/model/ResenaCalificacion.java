package com.example.EcoMarketSPA.model;

import java.sql.Date;

public class ResenaCalificacion {
    private int id_resena;//pk
    private int id_cliente;//fk
    private int id_producto;//fk
    private String motivo;
    private boolean estado;
    private Date fecha;
}

