package com.adn.natillera.persona.modelo.dto;

import com.adn.natillera.persona.modelo.entidad.EstadoPersonaNatillera;

public class PersonaNatilleraDto {

    private Long id;
    private Long idPersona;
    private Integer idNatillera;
    private EstadoPersonaNatillera estado;

    public PersonaNatilleraDto(Long id, Long idPersona, Integer idNatillera, EstadoPersonaNatillera estado) {
        this.id = id;
        this.idPersona = idPersona;
        this.idNatillera = idNatillera;
        this.estado = estado;
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
