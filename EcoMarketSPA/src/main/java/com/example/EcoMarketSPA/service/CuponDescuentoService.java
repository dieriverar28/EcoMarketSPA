package com.example.EcoMarketSPA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.EcoMarketSPA.model.CuponDescuento;
import com.example.EcoMarketSPA.repository.CuponDescuentoRepository;

@Repository
public class CuponDescuentoService {
    @Autowired
//SE LLAMA AL REPOSITORIO DE CUPON DESCUENTO PARA REALIZAR LAS OPERACIONES DE LA BASE DE DATOS
    private CuponDescuentoRepository cuponDescuentoRepository;
//OBTENER CUPON DESCUENTO POR ID
    public CuponDescuento getCuponDescuentoById(int id_cupon_descuento) {
        return cuponDescuentoRepository.buscarCuponDescuento(id_cupon_descuento);
    }
//CREAR CUPON DESCUENTO
    public CuponDescuento saveCuponDescuento(CuponDescuento cuponDescuento) {
        return cuponDescuentoRepository.guardarCuponDescuento(cuponDescuento);
    }
//ACTUALIZAR CUPON DESCUENTO
    public int updateCuponDescuento(CuponDescuento cuponDescuento) {
        return cuponDescuentoRepository.modificarCuponDescuento(cuponDescuento);
    }
//ELIMINAR CUPON DESCUENTO
    public int deleteCuponDescuento(int id_cupon_descuento) {
        return cuponDescuentoRepository.eliminarCuponDescuento(id_cupon_descuento);
    }

}