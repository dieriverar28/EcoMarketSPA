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
@Table(name="envio") //la tabla nombre persona
@Data //antes de data ahora va lo de arriba
@AllArgsConstructor
@NoArgsConstructor

public class Envio {
    @Id
    private int id_envio; //pk
    private int id_cliente; //fk
    private int id_provedor;//fk
    private int id_ruta; //fk
    private boolean estado;
    @Column(name="fecha_despacho", nullable =false)
    private Date fecha_despacho;
    @Column(name="fecha_entrega_est", nullable =false)
    private Date fecha_entrega_est;

}
