package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.EcoMarketSPA.model.Producto;


@Repository
public class ProductoRepository {
    //Lista para guardar Productos
    private List<Producto>productos=new ArrayList<>();

    //OBTNENER TODOS
    public List<Producto> obtenerProductos(){
        return productos;
    }

    //BUSCAR X id_producto
    public Producto buscarProducto(int id_producto){
        for (Producto pro : productos) {
            if (pro.getId_producto()== id_producto) {
                return pro;
            }
        }
        return null;
    }

    // ELIMINAR POR ID
    public int eliminarProducto(int id_producto) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId_producto() == id_producto) {
                productos.remove(i);
                return 1;
            }
        }
        return 0;
    }

    // GUARDAR producto
    public Producto guardarProducto(Producto producto) {
        productos.add(producto);
        return producto;
    }

    // MODIFICAR producto
    public int modificarProducto(Producto producto) {
    try {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId_producto() == producto.getId_producto()) {
                productos.get(i).setNombre(producto.getNombre());
                productos.get(i).setDescripcion(producto.getDescripcion());
                productos.get(i).setCategoria(producto.getCategoria());
                productos.get(i).setPrecio_base(producto.getPrecio_base());
                productos.get(i).setEstado(false);
                return 1; // modificado
            }
        }
        return 0; // no encontrado
    } catch (Exception e) {
        return -1; // error
    }
    }



}
