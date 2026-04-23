package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.EcoMarketSPA.model.Venta;


@Repository
public class VentaRepository {
    //Lista para guardar ventas
    private List<Venta>ventas=new ArrayList<>();


    //OBTNENER TODOS
    public List<Venta> obtenerVentas(){
        return ventas;
    }

    //BUSCAR X id_venta
    public Venta buscarVenta(int id_venta){
        for (Venta ven : ventas) {
            if (ven.getId_venta()== id_venta) {
                return ven;
            }
        }
        return null;
    }

    // ELIMINAR POR ID
    public int eliminarVenta(int id_venta) {
        for (int i = 0; i < ventas.size(); i++) {
            if (ventas.get(i).getId_venta() == id_venta) {
                ventas.remove(i);
                return 1;
            }
        }
        return 0;
    }

    // GUARDAR ventas
    public Venta guardarVenta(Venta venta) {
        ventas.add(venta);
        return venta;
    }

    // MODIFICAR ventas
    public int modificarVenta(Venta venta) {
    try {
        for (int i = 0; i < ventas.size(); i++) {
            if (ventas.get(i).getId_venta() == venta.getId_venta()) {
                ventas.get(i).setFecha_venta(null);
                ventas.get(i).setTotal_neto(venta.getTotal_neto());
                ventas.get(i).setDescuento_aplicado(venta.getDescuento_aplicado());
                ventas.get(i).setTipo_documento(venta.getTipo_documento());
                return 1; // modificado
            }
        }
        return 0; // no encontrado
    } catch (Exception e) {
        return -1; // error
    }
    }
}
