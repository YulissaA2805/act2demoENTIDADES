package com.example.act2demo.entities.correo;
//CORREO(remitente, destinatario, asunto, cont_mensaje, estado)

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Correo{

    @Id
    private String id_correo;
    private String remitente;
    private String cont_mensaje;
    private String destinatario;
    private String asunto;
    private String estado;

    public Correo() {

    }

    public Correo(String id_correo, String remitente, String destinatario, String asunto, String estado, String cont_mensaje) {
        super();
        this.id_correo = id_correo;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.cont_mensaje = cont_mensaje;
        this.estado = estado;
    }

    public String getId_correo() {
        return id_correo;
    }

    public void setId_correo(String id_correo) {
        this.id_correo = id_correo;
    }

    public String getCont_mensaje() {
        return cont_mensaje;
    }

    public void setCont_mensaje(String cont_mensaje) {
        this.cont_mensaje = cont_mensaje;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}


