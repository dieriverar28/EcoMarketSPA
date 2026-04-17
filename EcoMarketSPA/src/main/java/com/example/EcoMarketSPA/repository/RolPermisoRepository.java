package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.EcoMarketSPA.model.RolPermiso;


@Repository
public class RolPermisoRepository {
    //Lista para guardar rol permiso
    private List<RolPermiso>rolpermisos=new ArrayList<>();

    //OBTNENER TODOS
    public List<RolPermiso> obtenerRolPermiso(){
        return rolpermisos;
    }

    //BUSCAR X id_rol
    public RolPermiso buscarRolPermiso(int id_rol){
        for (RolPermiso rp : rolpermisos) {
            if (rp.getId_rol() == id_rol) {
                return rp;
            }
        }
        return null;
    }

    // ELIMINAR POR ID
    public int eliminarRolPermiso(int id_rol) {
        for (int i = 0; i < rolpermisos.size(); i++) {
            if (rolpermisos.get(i).getId_rol() == id_rol) {
                rolpermisos.remove(i);
                return 1;
            }
        }
        return 0;
    }

    // GUARDAR rolpermiso
    public RolPermiso guardarRolPermiso(RolPermiso rolpermiso) {
        rolpermisos.add(rolpermiso);
        return rolpermiso;
    }

    // MODIFICAR rol
    public int modificarRolPermiso(RolPermiso rolpermiso) {
    try {
        for (int i = 0; i < rolpermisos.size(); i++) {
            if (rolpermisos.get(i).getId_rol() == rolpermiso.getId_rol()) {
                rolpermisos.get(i).setNombre_rol(rolpermiso.getNombre_rol());;
                rolpermisos.get(i).setModulo(rolpermiso.getModulo());;
                rolpermisos.get(i).setAccion(rolpermiso.getAccion());
                return 1; // modificado
            }
        }
        return 0; // no encontrado
    } catch (Exception e) {
        return -1; // error
    }
    }





}
