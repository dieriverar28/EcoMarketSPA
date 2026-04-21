package com.example.EcoMarketSPA.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //se conecta con entidad
@Table(name="resenacalificacion") //la tabla nombre persona
@Data //antes de data ahora va lo de arriba
@AllArgsConstructor
@NoArgsConstructor


public class ResenaCalificacion {
    @Id
    private int id_resena;//pk
    @Column(name="id_cliente", nullable =false)
    @OneToMany(mappedBy = "cliente")
    private int id_cliente;//fk
    @Column(name="id_producto", nullable =false)
    @OneToMany(mappedBy = "producto")
    private int id_producto;//fk
    @Column(name="motivo", nullable =false)
    private String motivo;
    @Column(name="estado", nullable =false)
    private boolean estado;
    private Date fecha;
}

