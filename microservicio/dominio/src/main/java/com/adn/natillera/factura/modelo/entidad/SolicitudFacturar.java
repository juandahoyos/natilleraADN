package com.adn.natillera.factura.modelo.entidad;

import com.adn.natillera.cliente.entidad.Cliente;

import java.util.List;

public record SolicitudFacturar(

        Cliente cliente,
        List<ProductoFacturar> productosFacturar
) {

}
