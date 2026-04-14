package com.example.EcoMarketSPA.model;

import java.sql.Date;

public class Venta {
    private int id_venta;//pk
    private int id_pedido;//fk
    private int id_tienda;//fk
    private int id_cliente;//FK
    private Date fecha_venta;
    private int total_neto;
    private int descuento_aplicado;
    private String tipo_documento;
}
