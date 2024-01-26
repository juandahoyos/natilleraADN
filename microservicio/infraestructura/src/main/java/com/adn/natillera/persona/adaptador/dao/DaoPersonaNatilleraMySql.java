package com.adn.natillera.persona.adaptador.dao;


import com.adn.natillera.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.adn.natillera.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.adn.natillera.persona.modelo.dto.PersonaNatilleraDto;
import com.adn.natillera.persona.modelo.entidad.PersonaNatillera;
import com.adn.natillera.persona.puerto.dao.PersonaNatilleraDao;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class DaoPersonaNatilleraMySql implements PersonaNatilleraDao {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    private final MapeoPersonaNatillera mapeoPersonaNatillera;

    public DaoPersonaNatilleraMySql(
            CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate,
            MapeoPersonaNatillera mapeoPersonaNatillera) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
        this.mapeoPersonaNatillera = mapeoPersonaNatillera;
    }

    @SqlStatement(namespace = "persona", value = "existePersonaNatillera")
    private static String sqlExistePersonaNatillera;

    @Override
    public List<PersonaNatilleraDto> obtenerPersonaNatilleraPorIdPersonaYIdNatillera(PersonaNatillera personaNatillera) {
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate()
                .query(sqlExistePersonaNatillera, mapeoPersonaNatillera);
    }

}
