package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.EcoMarketSPA.model.RolPermiso;


@Repository
public interface RolPermisoRepository extends JpaRepository<RolPermiso, Integer> {
    @Query("SELECT rp FROM RolPermiso rp")
    List<RolPermiso> obtenerRolPermiso();

    @Query("SELECT rp FROM RolPermiso rp WHERE rp.id_rol_permiso = :id_rol_permiso")
    RolPermiso buscarRolPermiso(int id_rol_permiso);

}
