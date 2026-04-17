package com.example.EcoMarketSPA.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity //se conecta con entidad
@Table(name="stockinventario") //la tabla nombre persona
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class StockInventario {
    @Id
    private int id_stock;//pk
    @Column(name="id_tienda",nullable= false)
    private int id_tienda;//fk
    @Column(name="id_producto",nullable=false)
    private int id_producto; //fk
    @Column(name="cantidad",nullable=false)
    private int cantidad;
    private int stock_min;

}
