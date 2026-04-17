package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.EcoMarketSPA.model.Tienda;

@Repository
public class TiendaRepository {
    //Lista para guardar tiendas
    private List<Tienda>tiendas=new ArrayList<>();

    //OBTNENER TODOS
    public List<Tienda> obtenerTienda(){
        return tiendas;
    }

    //BUSCAR X id_tienda
    public Tienda buscarTienda(int id_tienda){
        for (Tienda tie : tiendas) {
            if (tie.getId_tienda()== id_tienda) {
                return tie;
            }
        }
        return null;
    }

    // ELIMINAR POR ID
    public int eliminarTienda(int id_tienda) {
        for (int i = 0; i < tiendas.size(); i++) {
            if (tiendas.get(i).getId_tienda() == id_tienda) {
                tiendas.remove(i);
                return 1;
            }
        }
        return 0;
    }

    // GUARDAR tienda
    public Tienda guardarTienda(Tienda tienda) {
        tiendas.add(tienda);
        return tienda;
    }

    // MODIFICAR tienda
    public int modificarTienda(Tienda tienda) {
    try {
        for (int i = 0; i < tiendas.size(); i++) {
            if (tiendas.get(i).getId_tienda() == tienda.getId_tienda()) {
                tiendas.get(i).setNombre(tienda.getNombre());
                tiendas.get(i).setDireccion(tienda.getDireccion());
                return 1; // modificado
            }
        }
        return 0; // no encontrado
    } catch (Exception e) {
        return -1; // error
    }
    }

}
