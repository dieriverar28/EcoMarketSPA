package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.EcoMarketSPA.model.Pedido;


@Repository
public class PedidoRepository {
    //Lista para guardar pedidos
    private List<Pedido>pedidos=new ArrayList<>();

    //OBTNENER TODOS
    public List<Pedido> obtenerPedidos(){
        return pedidos;
    }

    //BUSCAR X id_pedido
    public Pedido buscarPedido(int id_pedido){
        for (Pedido ped : pedidos) {
            if (ped.getId_pedido() == id_pedido) {
                return ped;
            }
        }
        return null;
    }

    // ELIMINAR POR ID
    public int eliminarPedido(int id_pedido) {
        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getId_pedido() == id_pedido) {
                pedidos.remove(i);
                return 1;
            }
        }
        return 0;
    }

    // GUARDAR pedido
    public Pedido guardarPedido(Pedido pedido) {
        pedidos.add(pedido);
        return pedido;
    }

    // MODIFICAR COMUNA
    public int modificarPedido(Pedido pedido) {
    try {
        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getId_pedido() == pedido.getId_pedido()) {
                pedidos.get(i).setEstado(false);
                pedidos.get(i).setFecha_pedido(pedido.getFecha_pedido());
                return 1; // modificado
            }
        }
        return 0; // no encontrado
    } catch (Exception e) {
        return -1; // error
    }
    }

}
