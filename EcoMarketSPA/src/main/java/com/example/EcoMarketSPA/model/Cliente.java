package com.example.EcoMarketSPA.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //se conecta con entidad
@Table(name="cliente") //la tabla nombre persona
@Data //antes de data ahora va lo de arriba
@AllArgsConstructor
@NoArgsConstructor

//con genero normalizado
public class Cliente {
    @Id
    private int id_cliente; //pk
    private int id_genero; //fk
    @Column(name="nombre", nullable =false)
    private String nombre;
    @Column(name="email", nullable =false)
    private String email;
    @Column(name="telefono", nullable =false)
    private String telefono;
    private int id_comuna; //FK
    @Column(name="direccion_envio", nullable =false)
    private String  direccion_envio;
}
