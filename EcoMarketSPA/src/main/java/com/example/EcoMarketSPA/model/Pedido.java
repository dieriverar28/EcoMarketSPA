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
@Table(name="pedido") //la tabla nombre persona
@Data //antes de data ahora va lo de arriba
@AllArgsConstructor
@NoArgsConstructor

public class Pedido {
    @Id
    private int id_pedido; //pk
    @Column(name="id_cliente", nullable =false)
    @OneToMany(mappedBy = "cliente")
    private int id_cliente; //fk cliente
    @Column(name="id_tienda", nullable =false)
    @OneToMany(mappedBy = "tienda")
    private int id_tienda;  //fk tienda
    @Column(name="estado", nullable =false)
    private boolean estado;
    @Column(name="id_cupon", nullable =false)
    @OneToMany(mappedBy = "cupondescuento")
    private int id_cupon; //fk cupon
    @Column(name="fecha_pedido", nullable =false)
    private Date fecha_pedido;
}
