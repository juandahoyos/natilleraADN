package com.adn.natillera.factura.comando;

import java.util.List;

public record ComandoSolicitudFacturar(
        Long idCliente,
        List<ComandoProductoFacturar> comandoProductosFacturar
) {
}
