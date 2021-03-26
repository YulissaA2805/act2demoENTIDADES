package com.example.act2demo.entities.correo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CorreoService {

    @Autowired
    private CorreoRepository correoRepository;

    public List<Correo> getAllCorreo(){
        List<Correo> correo = new ArrayList<>();
        correoRepository.findAll()
                .forEach(correo::add);
        return correo;
    }

    public Correo getCorreo(String id_correo){
        return correoRepository.findById(id_correo).orElseThrow(() -> new EntityNotFoundException(id_correo));
    }

    public void addCorreo(Correo correo){
        correoRepository.save(correo);
    }

    public void updateCorreo(String id_correo, Correo correo) { correoRepository.save(correo);
    }

    public void deleteCorreo(String id_correo) { correoRepository.delete(getCorreo(id_correo));
    }
}


