package com.example.EcoMarketSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcoMarketSPA.model.DevolucionReclamo;
import com.example.EcoMarketSPA.repository.DevolucionReclamoRepository;

@Service
public class DevolucionReclamoService {
    @Autowired
//LLAMAR REPOSITORIO
    private DevolucionReclamoRepository devolucionReclamoRepository;
//OBTENER TODOS
    public List<DevolucionReclamo> getDevolucionReclamos() {
        return devolucionReclamoRepository.obtenerDevolucionReclamos();
    }   
//OBTENER POR ID
    public DevolucionReclamo getDevolucionReclamoById(int id_devolucion) {
        return devolucionReclamoRepository.busDevolucionReclamo(id_devolucion);
    }
//CREAR DevolucionReclamo
    public DevolucionReclamo saveDevolucionReclamo(DevolucionReclamo devolucion) {
        return devolucionReclamoRepository.guardarDevolucionReclamo(devolucion);
    }
//ACTUALIZAR DevolucionReclamo
    public int updateDevolucionReclamo(DevolucionReclamo devolucion) {
        return devolucionReclamoRepository.modificarDevolucionReclamo(devolucion);
    }   
//ELIMINAR DevolucionReclamo
    public int deleteDevolucionReclamo(int id_devolucion) {
        return devolucionReclamoRepository.eliminarDevolucionReclamo(id_devolucion);
    }      
//MODIFICAR ESTADO DE DevolucionReclamo
    public int PostularDevolucionReclamo(DevolucionReclamo devolucion) {
        return devolucionReclamoRepository.modificarDevolucionReclamo(devolucion);
    }
}
