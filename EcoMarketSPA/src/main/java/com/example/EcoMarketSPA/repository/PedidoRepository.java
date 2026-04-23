package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.EcoMarketSPA.model.Pedido;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    @Query("SELECT p FROM Pedido p")
    List<Pedido> obtenerPedidos();

    @Query("SELECT p FROM Pedido p WHERE p.id_pedido = :id_pedido")
    Pedido buscarPedido(int id_pedido);

}
