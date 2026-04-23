package com.example.EcoMarketSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcoMarketSPA.model.Usuario;
import com.example.EcoMarketSPA.repository.UsuarioRepository;



@Service
public class UsuarioService {
    @Autowired

    private UsuarioRepository usuarioRepository;
    //obtener
    private List<Usuario> getUsuarios(){
        return usuarioRepository.obtenerUsuario();
    }
    //bucar
    public Usuario getUsuario(int id_usuario){
        return usuarioRepository.buscarUsuario(id_usuario);
    }
    //eliminar
    public int deleteUsuario(int id_usuario){
        return usuarioRepository.eliminarUsuario(id_usuario);
    }
    //buardar
    public Usuario saveUsuario(Usuario usuario){
        return usuarioRepository.guardarUsuario(usuario);
    }
    //modificar
    public int updateUsuario(Usuario usuario){
        return usuarioRepository.modificarUsuario(usuario);
    }
}
