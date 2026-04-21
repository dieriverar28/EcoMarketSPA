package com.example.EcoMarketSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcoMarketSPA.model.StockInventario;
import com.example.EcoMarketSPA.repository.StockInventarioRepository;




@Service
public class StockInventarioService {
    @Autowired
    private StockInventarioRepository stockInventarioRepository;
    //obtener
    public List<StockInventario> getStockInventarios(){
        return stockInventarioRepository.obtenerStockInventarios();
    } 
    //bucar
    public StockInventario getStockInventario(int id_stock_inventario){
        return stockInventarioRepository.buscarStockInventario(id_stock_inventario);
    }
    //eliminar
    public int deleteStockInventario(int id_stock_inventario){
        return stockInventarioRepository.eliminarStockInventario(id_stock_inventario);
    }
    //buardar
    public StockInventario saveStockInventario(StockInventario stockInventario){
        return stockInventarioRepository.guardarStockInventario(stockInventario)
    }
    //modificar
    public StockInventario updateStockInventario(StockInventario stockInventario){
        return stockInventarioRepository.modificarStockInventario(stockInventario);
    }


}
