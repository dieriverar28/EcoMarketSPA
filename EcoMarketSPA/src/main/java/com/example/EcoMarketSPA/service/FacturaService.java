package com.example.EcoMarketSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcoMarketSPA.model.Factura;
import com.example.EcoMarketSPA.repository.FacturaRepository;

@Service
public class FacturaService {
    @Autowired
//LLAMAR REPOSITORIO
    private FacturaRepository facturaRepository;
//OBTENER TODOS
    public List<Factura> getFacturas(){
        return facturaRepository.obtenerCuponDescuentos();
    }

    //BUSCAR X id_factura
    public Factura getFactura(int id_factura){
        return facturaRepository.buscarFactura(id_factura);
    }

    // ELIMINAR POR ID
    public int deleteFactura(int id_factura) {
        return facturaRepository.eliminarFactura(id_factura);
    }

    // GUARDAR factura
    public Factura saveFactura(Factura factura) {
        return facturaRepository.guardarFactura(factura);
    }

    // MODIFICAR factura
    public int updateFactura(Factura factura) {
        return facturaRepository.modificarFactura(factura);
    }

}
