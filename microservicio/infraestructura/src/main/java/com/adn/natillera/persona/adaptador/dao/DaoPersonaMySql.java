package com.adn.natillera.persona.adaptador.dao;

import com.adn.natillera.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.adn.natillera.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.adn.natillera.persona.modelo.dto.PersonaDto;
import com.adn.natillera.persona.adaptador.repositorio.MapeoPersona;
import com.adn.natillera.persona.puerto.dao.PersonaDao;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DaoPersonaMySql implements PersonaDao {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    public DaoPersonaMySql(
            CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @SqlStatement(namespace = "persona", value = "obtenerPersonaPorNumeroDocumento")
    private static String sqlObtenerPersonaPorNumeroDocumento;

    @Override
    public PersonaDto obtenerPersonaPorNumeroDocumento(String numeroDocumento) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("numeroDocumento", numeroDocumento);
        List<PersonaDto> personas = customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlObtenerPersonaPorNumeroDocumento, paramSource, new MapeoPersona());
        return personas.isEmpty() ? null : personas.get(0);
    }
}
