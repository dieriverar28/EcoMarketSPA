package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.example.EcoMarketSPA.model.CuponDescuento;

@Repository
public class CuponDescuentoRepository {
    //Lista para guardar Cupon
    private List<CuponDescuento>cupones=new ArrayList<>();

    //OBTNENER TODOS
    public List<CuponDescuento> obtenerCuponDescuentos(){
        return cupones;
    }

    //BUSCAR X id_comuna
    public CuponDescuento buscarCuponDescuento(int id_cupon){
        for (CuponDescuento cu : cupones) {
            if (cu.getId_cupon() == id_cupon) {
                return cu;
            }
        }
        return null;
    }

    // ELIMINAR POR ID
    public int eliminarCuponDescuento(int id_cupon) {
        for (int i = 0; i < cupones.size(); i++) {
            if (cupones.get(i).getId_cupon() == id_cupon) {
                cupones.remove(i);
                return 1;
            }
        }
        return 0;
    }

    // GUARDAR Cupon
    public CuponDescuento guardarCuponDescuento(CuponDescuento cupon) {
        cupones.add(cupon);
        return cupon;
    }

    // MODIFICAR COMUNA
    public int modificarCuponDescuento(CuponDescuento cupon) {
    try {
        for (int i = 0; i < cupones.size(); i++) {
            if (cupones.get(i).getId_cupon() == cupon.getId_cupon()) {
                cupones.get(i).setCodigo(cupon.getCodigo());
                cupones.get(i).setDescuento_pct(cupon.getDescuento_pct());
                cupones.get(i).setDescuento_monto(cupon.getDescuento_monto());
                cupones.get(i).setFecha_expiracion(cupon.getFecha_expiracion());
                cupones.get(i).setActivo(false);
                return 1; // modificado
            }
        }
        return 0; // no encontrado
    } catch (Exception e) {
        return -1; // error
    }
    }

}
