package com.example.EcoMarketSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcoMarketSPA.model.Proveedor;
import com.example.EcoMarketSPA.repository.ProveedorRepository;


@Service
public class ProveedorService {
    @Autowired
    private ProveedorRepository proveedorRepository;

    //obtener
    public List<Proveedor> getProveedores(){
        return proveedorRepository.obtenerProveedor();
    }
    //bucar
    public Proveedor getProveedor(int id_proveedor){
        return proveedorRepository.buscarProveedor(id_proveedor);
    }
    //eliminar
    public int deleteProveedor(int id_proveedor){
        return proveedorRepository.eliminarProveedor(id_proveedor);
    }
    //guardar
    public Proveedor saveProveedor(Proveedor proveedor){
        return proveedorRepository.guardarProveedor(proveedor);
    }
    //modificar
    public int updateProveedor(Proveedor proveedor){
        return proveedorRepository.modificarProveedor(proveedor);
    }


}
