package com.adn.natillera.persona.comando;

import java.util.List;

public class ComandoCrearPersona {

    private String nombres;
    private String apellidos;
    private String tipoDocumento;
    private String numeroDocumento;
    private String celular;
    private String correo;
    private List<Integer> idsNatilleras;

    public ComandoCrearPersona() { }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Integer> getIdsNatilleras() {
        return idsNatilleras;
    }

    public void setIdsNatilleras(List<Integer> idsNatilleras) {
        this.idsNatilleras = idsNatilleras;
    }
}
