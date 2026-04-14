package com.example.EcoMarketSPA.model;

public class Tienda {
    private int id_tienda; //pk
    private String nombre;
    private String direccion;
    private int id_comuna; //fk comuna
    private int id_region; //fk region
}
