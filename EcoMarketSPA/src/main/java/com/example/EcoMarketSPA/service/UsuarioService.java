package com.example.EcoMarketSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcoMarketSPA.model.Usuario;
import com.example.EcoMarketSPA.repository.UsuarioRepository;

import jakarta.transaction.Transactional;



@Service
@Transactional
public class UsuarioService {
    @Autowired

    private UsuarioRepository usuarioRepository;
    //obtener
    public List<Usuario> getUsuarios(){
        return usuarioRepository.obtenerUsuario();
    }
    //bucar
    public Usuario getUsuario(int id_usuario){
        Usuario usuarios = usuarioRepository.buscarUsuario(id_usuario);
        if (usuarios!=null) {
        return usuarios;
        }else
        return new Usuario();
    }
    //eliminar
    public int deleteUsuario(int id_usuario){
        usuarioRepository.deleteById(id_usuario);
        return 1;
    }
    //buardar
    public Usuario saveUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    //modificar
    public int updateUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
        return 1;
    }
}
