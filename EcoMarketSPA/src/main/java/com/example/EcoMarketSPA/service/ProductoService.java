package com.example.EcoMarketSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcoMarketSPA.model.Producto;
import com.example.EcoMarketSPA.repository.ProductoRepository;




@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    //obtener
    public List<Producto> getProductos(){
        return productoRepository.obtenerProductos();
    }
    //buscar
    public Producto getProducto(int id_producto){
        Producto productos = productoRepository.buscarProducto(id_producto);
        if (productos!=null) {
        return productos;
        }else
        return new Producto();
    }
    //eliminar
    public int deleteProducto(int id_producto){
        productoRepository.delete(getProducto(id_producto));
        return 1;
    }
    //guardar
    public Producto saveProducto(Producto producto){
        return productoRepository.save(producto);
    }
    //modifiicar
    public int updateProducto(Producto producto){
        productoRepository.save(producto);
        return 1;
    }
}
