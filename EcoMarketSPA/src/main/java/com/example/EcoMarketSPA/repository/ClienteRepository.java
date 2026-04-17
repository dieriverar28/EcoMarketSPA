package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.EcoMarketSPA.model.Cliente;

@Repository
public class ClienteRepository {

    // lista para guardar los clientes
    private List<Cliente> clientes = new ArrayList<>();

    // OBTENER TODOS
    public List<Cliente> obtenerClientes() {
        return clientes;
    }

    // BUSCAR POR ID
    public Cliente buscarCliente(int id_cliente) {
        for (Cliente cli : clientes) {
            if (cli.getId_cliente() == id_cliente) {
                return cli;
            }
        }
        return null;
    }

    // ELIMINAR POR ID
    public int eliminarCliente(int id_cliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId_cliente() == id_cliente) {
                clientes.remove(i);
                return 1;
            }
        }
        return 0;
    }

    // GUARDAR CLIENTE
    public Cliente guardarCliente(Cliente cliente) {
        clientes.add(cliente);
        return cliente;
    }
    // MODIFICAR INFO CLIENTE
    public int modificarCliente(Cliente cliente) {
    try {
        for (int i = 0; i < clientes.size(); i++) {

            if (clientes.get(i).getId_cliente() == cliente.getId_cliente()) {

                // actualiza todos los campos
                clientes.get(i).setNombre(cliente.getNombre());
                clientes.get(i).setEmail(cliente.getEmail());
                clientes.get(i).setTelefono(cliente.getTelefono());
                clientes.get(i).setDireccion_envio(cliente.getDireccion_envio());
                clientes.get(i).setId_comuna(cliente.getId_comuna());
                return 1; // modificado OK
            }
        }
        return 0; // no encontrado
    } catch (Exception e) {
        return -1; // error
        }
    }
}