package com.example.act2demo.entities.asistente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class AsistenteService {
    @Autowired
    private AsistenteRepository asistenteRepository;

    public List<Asistente> getAllAsistente(){
        List<Asistente> asistentes = new ArrayList<>();
        asistenteRepository.findAll()
                .forEach(asistentes::add);
        return asistentes;
    }

    public Asistente getAsistente(String id_asistente){
        return asistenteRepository.findById(id_asistente).orElseThrow(() -> new EntityNotFoundException(id_asistente));
    }

    public void addAsistente(Asistente asistente) { asistenteRepository.save(asistente); }

    public void updateAsistente(String id_asistente, Asistente asistente) { asistenteRepository.save(asistente); }

    public void deleteAsistente(String id_asistente) { asistenteRepository.delete(getAsistente(id_asistente)); }
}


