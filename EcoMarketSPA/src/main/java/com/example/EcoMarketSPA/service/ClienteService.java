package com.example.EcoMarketSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcoMarketSPA.model.Cliente;
import com.example.EcoMarketSPA.repository.ClienteRepository;

@Service
public class ClienteService {
        @Autowired
//SE LLAMA AL REPOSITORIO PARA PODER USAR SUS FUNCIONES
    private ClienteRepository clienteRepository; 

//OBTENER clientes
    public List<Cliente> getAllClientes() {
        return clienteRepository.obtenerClientes();
    }
//OBTENER BOLETA POR ID
    public Cliente getBoletaById(int id_cliente) {
        return clienteRepository.buscarCliente(id_cliente);
    }
//CREAR cliente
    public Cliente saveBoletas(Cliente cliente) {
        return clienteRepository.guardarCliente(cliente);
    }
//ACTUALIZAR cliente
    public int updateCliente(Cliente cliente) {
        return clienteRepository.modificarCliente(cliente);
    }
//ELIMINAR cliente
    public int deleteCliente(int id_cliente) {
        return clienteRepository.eliminarCliente(id_cliente);
    }
}
