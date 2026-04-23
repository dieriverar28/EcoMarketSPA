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
        return productoRepository.buscarProducto(id_producto);
    }
    //eliminar
    public int deleteProducto(int id_producto){
        return productoRepository.eliminarProducto(id_producto);
    }
    //guardar
    public Producto saveProducto(Producto producto){
        return productoRepository.guardarProducto(producto);
    }
    //modifiicar
    public int updateProducto(Producto producto){
        return productoRepository.modificarProducto(producto);
    }
}
