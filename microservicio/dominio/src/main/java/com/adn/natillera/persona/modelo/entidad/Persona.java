package com.adn.natillera.persona.modelo.entidad;

import java.time.LocalDateTime;

public class Persona {

    private Long idPersona;
    private String nombres;
    private String apellidos;
    private String tipoDocumento;
    private String numeroDocumento;
    private String celular;
    private String correo;
    private LocalDateTime fechaIngreso;
    private boolean activo;

    public Persona(String nombres, String apellidos, String tipoDocumento, String numeroDocumento, String celular,
                   String correo, LocalDateTime fechaIngreso, boolean activo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.celular = celular;
        this.correo = correo;
        this.fechaIngreso = fechaIngreso;
        this.activo = activo;
    }

    public Long getIdPersona() {
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

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public boolean isActivo() {
        return activo;
    }

}
