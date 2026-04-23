package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.example.EcoMarketSPA.model.DevolucionReclamo;

@Repository
public class DevolucionReclamoRepository {
    //Lista para guardar Cupon
    private List<DevolucionReclamo>devoluciones=new ArrayList<>();

    //OBTNENER TODOS
    public List<DevolucionReclamo> obtenerDevolucionReclamos(){
        return devoluciones;
    }

    //BUSCAR X id_devolucion
    public DevolucionReclamo busDevolucionReclamo(int id_devolucion){
        for (DevolucionReclamo dev : devoluciones) {
            if (dev.getId_devolucion() == id_devolucion) {
                return dev;
            }
        }
        return null;
    }

    // ELIMINAR POR ID
    public int eliminarDevolucionReclamo(int id_devolucion) {
        for (int i = 0; i < devoluciones.size(); i++) {
            if (devoluciones.get(i).getId_devolucion() == id_devolucion) {
                devoluciones.remove(i);
                return 1;
            }
        }
        return 0;
    }

    // GUARDAR Devolucion
    public DevolucionReclamo guardarDevolucionReclamo(DevolucionReclamo devolucion) {
        devoluciones.add(devolucion);
        return devolucion;
    }

    // MODIFICAR COMUNA
    public int modificarDevolucionReclamo(DevolucionReclamo devolucion) {
    try {
        for (int i = 0; i < devoluciones.size(); i++) {
            if (devoluciones.get(i).getId_devolucion() == devolucion.getId_devolucion()) {
                devoluciones.get(i).setMotivo(devolucion.getMotivo());
                devoluciones.get(i).setEstado(false);
                devoluciones.get(i).setFecha(devolucion.getFecha());
                return 1; // modificado
            }
        }
        return 0; // no encontrado
    } catch (Exception e) {
        return -1; // error
    }
    }
}
