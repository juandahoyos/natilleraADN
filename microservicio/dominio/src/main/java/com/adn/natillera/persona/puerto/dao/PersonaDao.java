package com.adn.natillera.persona.puerto.dao;

import com.adn.natillera.persona.modelo.dto.PersonaDto;

public interface PersonaDao {
    PersonaDto obtenerPersonaPorNumeroDocumento(String numeroDocumento);
}
