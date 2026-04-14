package com.example.EcoMarketSPA.model;

import java.sql.Date;

public class Envio {
    private int id_envio; //pk
    private int id_cliente; //fk
    private int id_provedor;//fk
    private int id_ruta; //fk
    private boolean estado;
    private Date fecha_despacho;
    private Date fecha_entrega_est;

}
