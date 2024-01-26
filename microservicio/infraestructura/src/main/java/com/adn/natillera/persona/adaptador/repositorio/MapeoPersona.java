package com.adn.natillera.persona.adaptador.repositorio;

import com.adn.natillera.persona.modelo.dto.PersonaDto;
import com.adn.natillera.infraestructura.jdbc.MapperResult;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

@Component
public class MapeoPersona implements RowMapper<PersonaDto>,MapperResult{

    @Override
    public PersonaDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        long idPersona =  rs.getInt("IdPersona");
        String nombres =  rs.getString("Nombres");
        String apellidos =  rs.getString("Apellidos");
        String tipoDocumento =  rs.getString("TipoDocumento");
        String numeroDocumento =  rs.getString("NumeroDocumento");
        String celular = rs.getString("Celular");
        String correo =  rs.getString("Correo");
        Date fechaIngreso =  rs.getDate("FechaIngreso");
        boolean activo =  rs.getBoolean("Activo");

        return new PersonaDto(idPersona, nombres, apellidos, tipoDocumento, numeroDocumento, celular, correo, fechaIngreso, activo);
    }
}
