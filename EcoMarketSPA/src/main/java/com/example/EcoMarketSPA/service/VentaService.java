package com.example.EcoMarketSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcoMarketSPA.model.Venta;
import com.example.EcoMarketSPA.repository.VentaRepository;





@Service
public class VentaService {
    @Autowired
    private VentaRepository ventaRepository;
    //obtener
    public List<Venta> getVentas(){
        return ventaRepository.obtenerVentas();
    }
    //bucar
    public Venta getVenta(int id_venta){
        return ventaRepository.buscarVenta(id_venta);
    }
    //eliminar
    public int deleteVenta(int id_venta){
        return ventaRepository.eliminarVenta(id_venta);
    }
    //buardar
    public Venta saveVenta(Venta venta){
        return ventaRepository.guardarVenta(venta);
    }
    //modificar
    public int updateVenta(Venta venta){
        return ventaRepository.modificarVenta(venta);
    }


}
