package com.example.EcoMarketSPA.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //se conecta con entidad
@Table(name="boleta") //a tabla nombre persona
@Data //antes de data ahora va lo de arriba
@AllArgsConstructor
@NoArgsConstructor

public class Boleta {
    @Id
    private int id_boleta;
      @Column(name="id_venta", nullable =false)
    private int id_venta;
    @Column(name="folio", nullable =false)
    private String folio;
    @Column(name="timbre_electronico", nullable =false)
    private String timbre_electronico;
      @Column(name="nombre_receptor", nullable =false)
    private String nombre_receptor;
    @Column(name="rut_receptor", nullable =false)
    private String rut_receptor;
    private String fecha_emision;
    private int monto_neto;
    private int monto_iva;
    private int monto_total;
    private String email_envio;
    private boolean anulada;

}   
