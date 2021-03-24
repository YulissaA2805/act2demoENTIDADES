package com.example.act2demo.entities.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAllUsuarios(){
        List<Usuario> usuarios = new ArrayList();
        usuarioRepository.findAll()
                .forEach(usuarios::add);
        return usuarios;
    }

    public Usuario getUsuario(String id_usuario){
        return usuarioRepository.findById(id_usuario).orElseThrow(() -> new EntityNotFoundException(id_usuario));
    }

    public void addUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public void updateUsuario(String id_usuario, Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public void deleteUsuario(String id_usuario) {
        usuarioRepository.deleteById(id_usuario);
    }
}
