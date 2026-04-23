package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.EcoMarketSPA.model.Factura;



@Repository
public class FacturaRepository {
    //Lista para guardar facturas
    private List<Factura>facturas=new ArrayList<>();

    //OBTNENER TODOS
    public List<Factura> obtenerCuponDescuentos(){
        return facturas;
    }

    //BUSCAR X id_factura
    public Factura buscarFactura(int id_factura){
        for (Factura fac : facturas) {
            if (fac.getId_factura() == id_factura) {
                return fac;
            }
        }
        return null;
    }
    
    // ELIMINAR POR ID
    public int eliminarFactura(int id_factura) {
        for (int i = 0; i < facturas.size(); i++) {
            if (facturas.get(i).getId_factura() == id_factura) {
                facturas.remove(i);
                return 1;
            }
        }
        return 0;
    }

    // GUARDAR factura
    public Factura guardarFactura(Factura factura) {
        facturas.add(factura);
        return factura;
    }

    // MODIFICAR factura
    public int modificarFactura(Factura factura) {
    try {
        for (int i = 0; i < facturas.size(); i++) {
            if (facturas.get(i).getId_factura() == factura.getId_factura()) {
                facturas.get(i).setFolio(factura.getFolio());
                facturas.get(i).setTimbre_electronico(factura.getTimbre_electronico());
                facturas.get(i).setRazon_social(factura.getRazon_social());
                facturas.get(i).setNumrun_cliente(factura.getNumrun_cliente());
                facturas.get(i).setDvrun_cliente(factura.getDvrun_cliente());
                facturas.get(i).setGiro(factura.getGiro());
                facturas.get(i).setFecha_emision(factura.getFecha_emision());
                facturas.get(i).setMonto_iva(factura.getMonto_iva());
                facturas.get(i).setMonto_total(factura.getMonto_total());
                facturas.get(i).setEmail_envio(factura.getEmail_envio());
                return 1; // modificado
            }
        }
        return 0; // no encontrado
    } catch (Exception e) {
        return -1; // error
    }
    }

}
