package com.adn.natillera.producto.adaptador.repositorio;

import com.adn.natillera.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.adn.natillera.infraestructura.jdbc.EjecucionBaseDeDatos;
import com.adn.natillera.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.adn.natillera.producto.entidad.Producto;
import com.adn.natillera.producto.puerto.RepositorioProducto;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioProductoMysql implements RepositorioProducto {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace = "producto", value = "obtenerporid")
    private static String sqlObtenerPorId;

    public RepositorioProductoMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public Producto obtener(Long id) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id", id);
        return EjecucionBaseDeDatos.obtenerUnObjetoONull(() ->
                this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlObtenerPorId,
                        paramSource, new MapeoProducto()));
    }

}
