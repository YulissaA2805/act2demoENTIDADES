package com.example.act2demo.entities.usuario;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {

    @Id
    private String id_usuario;
    private String nom_usuario;
    private String email;

    public Usuario() {

    }

    public Usuario(String id_usuario, String nom_usuario, String email) {
        this.id_usuario = id_usuario;
        this.nom_usuario = nom_usuario;
        this.email = email;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

