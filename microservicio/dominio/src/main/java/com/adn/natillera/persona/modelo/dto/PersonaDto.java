package com.adn.natillera.persona.modelo.dto;

import java.time.LocalDateTime;
import java.util.Date;

public class PersonaDto {

    private long idPersona;
    private String nombres;
    private String apellidos;
    private String tipoDocumento;
    private String numeroDocumento;
    private String celular;
    private String correo;
    private Date fechaIngreso;
    private boolean activo;

    public PersonaDto(Long idPersona, String nombres, String apellidos, String tipoDocumento, String numeroDocumento, String celular,
                   String correo, Date fechaIngreso, boolean activo) {
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.celular = celular;
        this.correo = correo;
        this.fechaIngreso = fechaIngreso;
        this.activo = activo;
    }

    public long getIdPersona() {
        return idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public String getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public boolean isActivo() {
        return activo;
    }
}
