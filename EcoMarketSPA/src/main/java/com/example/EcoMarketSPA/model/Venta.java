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
@Table(name="venta") //la tabla nombre persona
@Data //antes de data ahora va lo de arriba
@AllArgsConstructor
@NoArgsConstructor

public class Venta {
    @Id
    private int id_venta;//pk
    @Column(name = "id_pedido",nullable= false)
    @OneToMany(mappedBy = "pedido")
    private int id_pedido;//fk
    @Column(name = "id_tienda",nullable = false)
    @OneToMany(mappedBy = "tienda")
    private int id_tienda;//fk
    @Column(name = "id_cliente",nullable = false)
    @OneToMany(mappedBy = "cliente")
    private int id_cliente;//FK
    private Date fecha_venta;
    private int total_neto;
    private int descuento_aplicado;
    private String tipo_documento;
}
