package com.example.EcoMarketSPA.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //se conecta con entidad
@Table(name="usuario") //la tabla nombre persona
@Data
@AllArgsConstructor
@NoArgsConstructor

//con genero normalizado
public class Usuario {
    @Id
    private int id_usuario;
    private int id_genero; //fk
    @Column(name = "nombre",nullable= false)
    private String nombre;
    @Column(name = "email",nullable= false)
    private String email;
    private int id_rol;//fk rol
    private int id_tienda;//fk tienda
    private boolean estado; 
}
