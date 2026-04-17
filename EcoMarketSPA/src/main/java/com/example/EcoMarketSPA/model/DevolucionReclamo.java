package com.example.EcoMarketSPA.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //se conecta con entidad
@Table(name="devolucionreclamo") //la tabla nombre persona
@Data //antes de data ahora va lo de arriba
@AllArgsConstructor
@NoArgsConstructor


public class DevolucionReclamo {
    @Id 
    private int id_devolucion;//pk
    private int id_venta;//fk
    private int id_cliente;//fk
    private int id_producto;//fk
    @Column(name="motivo", nullable =false)
    private String motivo;
    @Column(name="estado", nullable =false)
    private boolean estado;
    @Column(name="fecha", nullable =false)
    private Date fecha;
}
