package com.example.act2demo.entities.habilidades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class HabilidadesController {
    @Autowired
    private HabilidadesService habilidadesService;

    @RequestMapping("/habilidades")
    public List<Habilidades> getAllHabilidades(){
        return habilidadesService.getAllHabilidades();
    }

    @RequestMapping("/habilidades/{id_habilidad}")
    public Habilidades getHabilidad(@PathVariable String id_habilidad){
        return habilidadesService.getHabilidad(id_habilidad);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/habilidades")
    public void addHabilidad(@RequestBody Habilidades habilidad){
        habilidadesService.addHabilidad(habilidad);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/habilidades/{id_habilidad}")
    public void updateHabilidad(@RequestBody Habilidades habilidad, @PathVariable String id_habilidad){
        habilidadesService.updateHabilidad(id_habilidad, habilidad);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/habilidades/{id_habilidad}")
    public void deleteHabilidad(@PathVariable String id_habilidad){
        habilidadesService.deleteHabilidad(id_habilidad);
    }
}
