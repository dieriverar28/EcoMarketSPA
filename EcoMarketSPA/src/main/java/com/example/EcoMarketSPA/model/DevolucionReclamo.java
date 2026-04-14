package com.example.EcoMarketSPA.model;

import java.sql.Date;

public class DevolucionReclamo {
    private int id_devolucion;//pk
    private int id_venta;//fk
    private int id_cliente;//fk
    private int id_producto;//fk
    private String motivo;
    private boolean estado;
    private Date fecha;
}
