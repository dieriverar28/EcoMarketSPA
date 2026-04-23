package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.EcoMarketSPA.model.Proveedor;


@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {
    @Query("SELECT p FROM Proveedor p")
    List<Proveedor> obtenerProveedor();

    @Query("SELECT p FROM Proveedor p WHERE p.id_proveedor = :id_proveedor")
    Proveedor buscarProveedor(int id_proveedor);

}
