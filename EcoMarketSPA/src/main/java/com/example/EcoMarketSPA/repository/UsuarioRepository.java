package com.example.EcoMarketSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.EcoMarketSPA.model.Usuario;

@Repository
public class UsuarioRepository {
    //Lista para guardar usuarios
    private List<Usuario>usuarios=new ArrayList<>();

    //OBTNENER TODOS
    public List<Usuario> obtenerUsuario(){
        return usuarios;
    }

    //BUSCAR X id_usuario
    public Usuario buscarUsuario(int id_usuario){
        for (Usuario us : usuarios) {
            if (us.getId_usuario() == id_usuario) {
                return us;
            }
        }
        return null;
    }

    // ELIMINAR POR ID
    public int eliminarUsuario(int id_usuario) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId_usuario() == id_usuario) {
                usuarios.remove(i);
                return 1;
            }
        }
        return 0;
    }

    // GUARDAR usuario
    public Usuario guardarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        return usuario;
    }

    // MODIFICAR usuario
    public int modificarUsuario(Usuario usuario) {
    try {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId_usuario() == usuario.getId_usuario()) {
                usuarios.get(i).setNombre(usuario.getNombre());
                usuarios.get(i).setEmail(usuario.getEmail());
                usuarios.get(i).setEstado(false);
                return 1; // modificado
            }
        }
        return 0; // no encontrado
    } catch (Exception e) {
        return -1; // error
    }
    }
}
