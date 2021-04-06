package com.example.act2demo.entities.asistente;

import com.example.act2demo.entities.habilidades.Habilidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Asistente {
    @Id
    private String id_asistente;
    private String nom_asistente;
    @ManyToOne
    private Habilidades habilidad;
    private String correo_asig;

    public Habilidades getHabilidad(){ return habilidad; }
    public void setId_habilidad(Habilidades habilidad){ this.habilidad = habilidad; }

    public Asistente(){

    }

    public Asistente(String id_asistente, String nom_asistente, String id_habilidad, String correo_asig){
        super();
        this.id_asistente = id_asistente;
        this.nom_asistente = nom_asistente;
        this.habilidad = new Habilidades(id_habilidad, "", "");
        this.correo_asig = correo_asig;
    }

    public String getId_asistente() { return id_asistente; }

    public void setId_asistente(String id_asistente) { this.id_asistente = id_asistente; }

    public String getNom_asistente() { return nom_asistente; }

    public void setNom_asistente(String nom_asistente) { this.nom_asistente = nom_asistente; }

    //public String getId_habilidad() { return id_habilidad; }

    //public void setId_habilidad(String id_habilidad) { this.id_habilidad = id_habilidad; }

    public String getCorreo_asig() { return correo_asig; }

    public void setCorreo_asig(String correo_asig) { this.correo_asig = correo_asig; }
}
