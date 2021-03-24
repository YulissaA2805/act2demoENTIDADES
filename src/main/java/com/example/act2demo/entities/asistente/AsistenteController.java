package com.example.act2demo.entities.asistente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class AsistenteController {
    @Autowired
    private AsistenteService asistenteService;

    @RequestMapping("/asistente")
    public List<Asistente> getAllAsistente() { return asistenteService.getAllAsistente(); }

    @RequestMapping("/Asistente/{id_asistente}")
    public Asistente getAsistente(@PathVariable String id_asistente){
        return asistenteService.getAsistente(id_asistente);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/asistente")
    public void addAsistente(@RequestBody Asistente asistente){
        asistenteService.addAsistente(asistente);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/asistente/{id_asistente}")
    public void updateAsistente(@RequestBody Asistente asistente, @PathVariable String id_asistente){
        asistenteService.updateAsistente(id_asistente, asistente);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/asistente/{id_asistente}")
    public void deleteAsistente(@PathVariable String id_asistente) {asistenteService.deleteAsistente(id_asistente);}
}

