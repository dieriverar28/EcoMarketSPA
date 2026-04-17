package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.EcoMarketSPA.model.StockInventario;

@Repository
public class StockInventarioRepository {
    //Lista para guardar stock
    private List<StockInventario>inventarios=new ArrayList<>();

    //OBTNENER TODOS
    public List<StockInventario> obtenerStockInventario(){
        return inventarios;
    }

    //BUSCAR X id_stock
    public StockInventario buscarStockInventario(int id_stock){
        for (StockInventario si : inventarios) {
            if (si.getId_stock() == id_stock) {
                return si;
            }
        }
        return null;
    }

    // ELIMINAR POR ID
    public int eliminarStockInventario(int id_stock) {
        for (int i = 0; i < inventarios.size(); i++) {
            if (inventarios.get(i).getId_stock() == id_stock) {
                inventarios.remove(i);
                return 1;
            }
        }
        return 0;

    }

    // GUARDAR stock
    public StockInventario guardarStockInventario(StockInventario stockinventario) {
        inventarios.add(stockinventario);
        return stockinventario;
    }

    // MODIFICAR stock
    public int modificarStockInventario(StockInventario stockinventario) {
    try {
        for (int i = 0; i < inventarios.size(); i++) {
            if (inventarios.get(i).getId_stock() == stockinventario.getId_stock()) {
                inventarios.get(i).setCantidad(stockinventario.getCantidad());
                inventarios.get(i).setStock_min(stockinventario.getStock_min());
                return 1; // modificado
            }
        }
        return 0; // no encontrado
    } catch (Exception e) {
        return -1; // error
    }
    }

}
