package com.adn.natillera.cliente.puerto;

import com.adn.natillera.cliente.entidad.Cliente;

public interface RepositorioCliente {

    Cliente obtener(Long id);
}
