package com.example.act2demo.entities.correo;

import com.example.act2demo.entities.habilidades.Habilidades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CorreoController {

    @Autowired
    private CorreoService correoService;

    @RequestMapping("/correo")
    public List<Correo> getAllCorreo(){
        return correoService.getAllCorreo();
    }

    @RequestMapping("/Correo/{id_enviador}")
    public Correo getCorreo(@PathVariable String id_correo){
        return correoService.getCorreo(id_correo);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/correo")
    public void addCorreo(@RequestBody Correo correo){
        correoService.addCorreo(correo);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/correo/{id_correo}")
    public void updateCorreo(@RequestBody Correo correo, @PathVariable String id_correo){
        correoService.updateCorreo(id_correo, correo);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/correo/{id_correo}")
    public void deleteCorreo(@PathVariable String id_correo){
        correoService.deleteCorreo(id_correo);
    }
}

