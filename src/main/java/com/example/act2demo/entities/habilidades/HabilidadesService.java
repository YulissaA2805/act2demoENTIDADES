package com.example.act2demo.entities.habilidades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HabilidadesService {
    @Autowired
    private HabilidadesRepository habilidadesRepository;

    public List<Habilidades> getAllHabilidades(){
        List<Habilidades> habilidades = new ArrayList<>();
        habilidadesRepository.findAll()
                .forEach(habilidades::add);
        return habilidades;
    }

    public Habilidades getHabilidad(String id_habilidad){
        return habilidadesRepository.findById(id_habilidad).orElseThrow(() -> new EntityNotFoundException(id_habilidad));
    }

    public void addHabilidad(Habilidades habilidad){
        habilidadesRepository.save(habilidad);
    }

    public void updateHabilidad(String id_habilidad, Habilidades habilidad) {
        habilidadesRepository.save(habilidad);
    }

    public void deleteHabilidad(String id_habilidad) {
        habilidadesRepository.delete(getHabilidad(id_habilidad));
    }

}
