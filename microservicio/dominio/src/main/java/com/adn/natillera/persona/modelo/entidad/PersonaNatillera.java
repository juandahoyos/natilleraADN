package com.adn.natillera.persona.modelo.entidad;

public class PersonaNatillera {

    private Long id;
    private Long idPersona;
    private Integer idNatillera;
    private EstadoPersonaNatillera estado;

    public PersonaNatillera(Integer idNatillera, EstadoPersonaNatillera estado) {
        this.idNatillera = idNatillera;
        this.estado = estado;
    }


    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }
    public Long getId() {
        return id;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public Integer getIdNatillera() {
        return idNatillera;
    }

    public EstadoPersonaNatillera getEstado() {
        return estado;
    }
}
