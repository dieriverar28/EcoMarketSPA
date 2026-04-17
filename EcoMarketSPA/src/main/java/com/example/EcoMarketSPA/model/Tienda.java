package com.example.EcoMarketSPA.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //se conecta con entidad
@Table(name="tienda") //la tabla nombre persona
@Data
@AllArgsConstructor
@NoArgsConstructor
    
public class Tienda {
    @Id
    private int id_tienda; //pk
    @Column(name= "nombre",nullable= false)
    private String nombre;
    @Column(name = " direcccion",nullable= false)
    private String direccion;
    private int id_comuna; //fk comuna
    private int id_region; //fk region
}
