package com.adn.natillera.producto.puerto;

import com.adn.natillera.producto.entidad.Producto;

public interface RepositorioProducto {

    Producto obtener(Long id);
}
