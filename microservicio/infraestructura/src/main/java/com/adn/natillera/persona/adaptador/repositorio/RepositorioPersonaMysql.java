package com.adn.natillera.persona.adaptador.repositorio;

import com.adn.natillera.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.adn.natillera.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.adn.natillera.persona.modelo.entidad.Persona;
import com.adn.natillera.persona.puerto.repositorio.RepositorioPersona;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioPersonaMysql implements RepositorioPersona {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    public RepositorioPersonaMysql(
            CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @SqlStatement(namespace = "persona", value = "crearPersona")
    private static String sqlCrearPersona;

    @Override
    public Long guardar(Persona persona) {
        return this.customNamedParameterJdbcTemplate.crear(persona, sqlCrearPersona);
    }
}
