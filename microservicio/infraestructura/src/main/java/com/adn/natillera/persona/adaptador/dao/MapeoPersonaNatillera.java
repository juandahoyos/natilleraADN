package com.adn.natillera.persona.adaptador.dao;

import com.adn.natillera.infraestructura.jdbc.MapperResult;
import com.adn.natillera.persona.modelo.dto.PersonaNatilleraDto;
import com.adn.natillera.persona.modelo.entidad.EstadoPersonaNatillera;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class MapeoPersonaNatillera implements RowMapper<PersonaNatilleraDto>, MapperResult {
    @Override
    public PersonaNatilleraDto mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        long id = resultSet.getLong("Id");
        long idPersona = resultSet.getLong("IdPersona");
        Integer idNatillera = resultSet.getInt("IdNatillera");
        EstadoPersonaNatillera estado = EstadoPersonaNatillera.valueOf(resultSet.getString("Estado"));

        return new PersonaNatilleraDto(id, idPersona, idNatillera, estado);
    }

}
