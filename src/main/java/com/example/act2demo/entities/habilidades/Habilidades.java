package com.example.act2demo.entities.habilidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Habilidades {
    @Id
    private String id_habilidad;
    private String nom_habilidad;
    private String descripcion;

    public Habilidades() {

    }

    public Habilidades(String id_habilidad, String nom_habilidad, String descripcion) {
        super();
        this.id_habilidad = id_habilidad;
        this.nom_habilidad = nom_habilidad;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id_habilidad;
    }

    public void setId(String id_habilidad) {
        this.id_habilidad = id_habilidad;
    }

    public String getName() {
        return nom_habilidad;
    }

    public void setName(String nom_habilidad) {
        this.nom_habilidad = nom_habilidad;
    }

    public String getDescription() {
        return descripcion;
    }

    public void setDescription(String descripcion) {
        this.descripcion = descripcion;
    }

}
