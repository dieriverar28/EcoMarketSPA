package com.example.EcoMarketSPA.model;

public class Cliente {
    private int id_cliente; //pk
    private int numrun_cliente;
    private String dvrun_cliente;
    private String nombre;
    private String email;
    private String telefono;
    private int id_comuna; //FK
    private String  direccion_envio;
}
