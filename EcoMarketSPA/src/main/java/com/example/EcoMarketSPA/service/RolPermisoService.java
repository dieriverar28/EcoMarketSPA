package com.example.EcoMarketSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.EcoMarketSPA.model.RolPermiso;
import com.example.EcoMarketSPA.repository.RolPermisoRepository;

public class RolPermisoService {  
    @Autowired
    private RolPermisoRepository rolPermisoRepository;

    //obtener
    public List<RolPermiso> getRolPermisos(){
        return rolPermisoRepository.obtenerRolPermiso();
    }
    //bucar
    public RolPermiso getRolPermiso(int id_rol_permiso){
        return rolPermisoRepository.buscarRolPermiso(id_rol_permiso);
    }
    //eliminar
    public int deleteRolPermiso(int id_rol_permiso){
        return rolPermisoRepository.eliminarRolPermiso(id_rol_permiso);
    }
    //guardar
    public RolPermiso saveRolPermiso(RolPermiso rolPermiso){
        return rolPermisoRepository.guardarRolPermiso(rolPermiso);
    }
    //modificar
    public RolPermiso updateRolPermiso(RolPermiso rolPermiso){
        return rolPermisoRepository.modificarRolPermiso(rolPermiso);
    }


}
