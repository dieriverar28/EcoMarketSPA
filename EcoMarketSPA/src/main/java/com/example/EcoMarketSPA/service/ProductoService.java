package com.example.EcoMarketSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.EcoMarketSPA.model.Producto;
import com.example.EcoMarketSPA.repository.ProductoRepository;

public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    //obtener
    public List<Producto> getProductos(){
        return productoRepository.obtenerProductos();
    }
    //buscar
    public Producto getProducto(int id_producto){
        return productoRepository.buscarProducto(id_producto);
    }
    //eliminar
    public int delateProducto(int id_producto){
        return productoRepository.eliminarProducto(id_producto);
    }
    //guardar
    public Producto saveProducto(Producto producto){
        return productoRepository.guardarProducto(producto);
    }
    //modifiicar
    public Producto updateProducto(Producto producto){
        return productoRepository.modificarProductoProducto(producto);
    }
}
