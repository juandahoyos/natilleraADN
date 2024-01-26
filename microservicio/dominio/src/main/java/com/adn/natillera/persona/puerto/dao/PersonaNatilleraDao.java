package com.adn.natillera.persona.puerto.dao;

import com.adn.natillera.persona.modelo.dto.PersonaNatilleraDto;
import com.adn.natillera.persona.modelo.entidad.PersonaNatillera;

import java.util.List;

public interface PersonaNatilleraDao {

    List<PersonaNatilleraDto> obtenerPersonaNatilleraPorIdPersonaYIdNatillera(PersonaNatillera personaNatillera);
}
