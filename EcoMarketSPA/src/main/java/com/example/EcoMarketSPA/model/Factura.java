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
@Table(name="factura") //a tabla nombre persona
@Data //antes de data ahora va lo de arriba
@AllArgsConstructor
@NoArgsConstructor
public class Factura {
    @Id
    private int id_factura;//pk
    private int id_venta;//fk
    @Column(name="folio", nullable =false)
    private String folio;
    @Column(name="timbre_electronico", nullable =false)
    private String timbre_electronico;
    @Column(name="razon_social", nullable =false)
    private String razon_social;
    @Column(name="numrun_cliente", nullable =false)
    private String numrun_cliente;
    @Column(name="dvrun_cliente", nullable =false)
    private String dvrun_cliente;
    @Column(name="giro", nullable =false)
    private String giro;
    private Date fecha_emision;
    private int monto_iva;
    private int monto_total;
    @Column(name="email_envio", nullable =false)
    private String email_envio;

}
