package com.example.EcoMarketSPA.model;

import java.sql.Date;

public class Factura {
    private int id_factura;//pk
    private int id_venta;//fk
    private String folio;
    private String timbre_electronico;
    private String razon_social;
    private String numrun_cliente;
    private String dvrun_cliente;
    private String giro;
    private Date fecha_emision;

}
