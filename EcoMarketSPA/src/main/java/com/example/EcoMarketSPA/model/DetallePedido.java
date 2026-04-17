package com.example.EcoMarketSPA.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //se conecta con entidad
@Table(name="detallepedido") //la tabla nombre persona
@Data //antes de data ahora va lo de arriba
@AllArgsConstructor
@NoArgsConstructor



public class DetallePedido {
    @Id
    private int id_detalle;//pk
    private int id_pedido;//fk
    private int id_producto;//fk
    @Column(name="cantidad", nullable =false)
    private int cantidad;
    @Column(name="precio_unitario", nullable =false)
    private int precio_unitario;
    
}
