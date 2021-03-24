package com.example.act2demo.entities.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping("/usuarios")
    public List<Usuario> getAllUsuarios(){
        return usuarioService.getAllUsuarios();
    }

    @RequestMapping("/usuarios/{id_usuario}")
    public Usuario getUsuario(@PathVariable String id_usuario){
        return usuarioService.getUsuario(id_usuario);
    }

    @RequestMapping(method = RequestMethod.POST, value ="/usuarios")
    public void addUsuario(@RequestBody Usuario usuario){
        usuarioService.addUsuario(usuario);
    }

    @RequestMapping(method = RequestMethod.PUT, value ="/usuarios/{id_usuario}")
    public void updateUsuario(@RequestBody Usuario usuario, @PathVariable String id_usuario){
        usuarioService.updateUsuario(id_usuario, usuario);
    }

    @RequestMapping(method = RequestMethod.DELETE, value ="/usuarios/{id_usuario}")
    public void deleteUsuario(@PathVariable String id_usuario){
        usuarioService.deleteUsuario(id_usuario);
    }
}

