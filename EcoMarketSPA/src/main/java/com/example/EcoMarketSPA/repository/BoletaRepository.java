package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.EcoMarketSPA.model.Boleta;


@Repository
public class BoletaRepository {
    //lISTA para guardar boletas
    private List<Boleta>boletas=new ArrayList<>();
    
    //OBTENER TODOS
    public List<Boleta> obtenerBoletas(){
        return boletas;
    }
    //BUSCAR X id_boleta
    public Boleta buscarBoleta(int id_boleta){
        for (Boleta bo : boletas) {
            if (bo.getId_boleta() == id_boleta) {
                return bo;
            }
        }
        return null;
    }
    // ELIMINAR POR ID
    public int eliminarBoleta(int id_boleta) {
        for (int i = 0; i < boletas.size(); i++) {
            if (boletas.get(i).getId_boleta() == id_boleta) {
                boletas.remove(i);
                return 1;
            }
        }
        return 0;
    }
    // GUARDAR COMUNA
    public Boleta guardarBoleta(Boleta boleta) {
        boletas.add(boleta);
        return boleta;
    }
    // MODIFICAR BOLETA
    public int modificarBoleta(Boleta boleta) {
    try {
        for (int i = 0; i < boletas.size(); i++) {

            if (boletas.get(i).getId_boleta() == boleta.getId_boleta()) {

                boletas.get(i).setId_venta(boleta.getId_venta());
                boletas.get(i).setFolio(boleta.getFolio());
                boletas.get(i).setTimbre_electronico(boleta.getTimbre_electronico());
                boletas.get(i).setNombre_receptor(boleta.getNombre_receptor());
                boletas.get(i).setRut_receptor(boleta.getRut_receptor());
                boletas.get(i).setFecha_emision(boleta.getFecha_emision());
                boletas.get(i).setMonto_neto(boleta.getMonto_neto());
                boletas.get(i).setMonto_iva(boleta.getMonto_iva());
                boletas.get(i).setMonto_total(boleta.getMonto_total());
                boletas.get(i).setEmail_envio(boleta.getEmail_envio());
                boletas.get(i).setAnulada(boleta.isAnulada());

                return 1; // modificado OK
            }
        }
        return 0; // no encontrado
    } catch (Exception e) {
        return -1; // error
    }
    }
    

}
