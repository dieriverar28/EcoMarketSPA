package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.EcoMarketSPA.model.Proveedor;


@Repository
public class ProveedorRepository {
    //Lista para guardar proveedores
    private List<Proveedor>proveedores=new ArrayList<>();

    //OBTNENER TODOS
    public List<Proveedor> obtenerProveedor(){
        return proveedores;
    }

    //BUSCAR X id_proveedor
    public Proveedor buscarProveedor(int id_proveedor){
        for (Proveedor prov : proveedores) {
            if (prov.getId_proveedor() == id_proveedor) {
                return prov;
            }
        }
        return null;
    }

    // ELIMINAR POR ID
    public int eliminarProveedor(int id_proveedor) {
        for (int i = 0; i < proveedores.size(); i++) {
            if (proveedores.get(i).getId_proveedor() == id_proveedor) {
                proveedores.remove(i);
                return 1;
            }
        }
        return 0;
    }

    // GUARDAR proveedor
    public Proveedor guardarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
        return proveedor;
    }

     // MODIFICAR proveedor
    public int modificarProveedor(Proveedor proveedor) {
    try {
        for (int i = 0; i < proveedores.size(); i++) {
            if (proveedores.get(i).getId_proveedor() == proveedor.getId_proveedor()) {
                proveedores.get(i).setNombre(proveedor.getNombre());
                proveedores.get(i).setTelefono(proveedor.getTelefono());
                proveedores.get(i).setEmail(proveedor.getEmail());
                return 1; // modificado
            }
        }
        return 0; // no encontrado
    } catch (Exception e) {
        return -1; // error
    }
    }
}
