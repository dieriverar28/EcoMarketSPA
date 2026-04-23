package com.example.EcoMarketSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcoMarketSPA.model.Pedido;
import com.example.EcoMarketSPA.repository.PedidoRepository;


@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    //
    public List<Pedido> getPedidos(){
        return pedidoRepository.obtenerPedidos();
    }
    //buscar
    public Pedido getPedido(int id_pedido){
    }
    //eliminar
    public int deletePedido(int id_pedido){
        pedidoRepository.delete(getPedido(id_pedido));
        return 1;
    }
    //guardar
    public Pedido savePedido(Pedido pedido){
        return pedidoRepository.save(pedido);
    }
    //modificar
    public int updatePedido(Pedido pedido){
        pedidoRepository.save(pedido);
        return 1;
    }

}
