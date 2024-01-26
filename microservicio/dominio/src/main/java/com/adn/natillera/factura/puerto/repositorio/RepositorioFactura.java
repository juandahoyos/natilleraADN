package com.adn.natillera.factura.puerto.repositorio;

import com.adn.natillera.factura.modelo.entidad.Factura;

public interface RepositorioFactura {
    Long guardar(Factura factura);
    Factura obtener(Long id);
    void actualizarEstado(Factura factura);
}
