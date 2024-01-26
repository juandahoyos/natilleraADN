package com.adn.natillera.factura.puerto.repositorio;

import com.adn.natillera.factura.modelo.entidad.Factura;
import com.adn.natillera.factura.modelo.entidad.ProductoFacturar;

import java.util.List;

public interface RepositorioProductoFacturar {

    void guardarPorFactura(Factura factura, Long idFactura);

    List<ProductoFacturar> obtenerPorFactura(Long idFactura);
}
