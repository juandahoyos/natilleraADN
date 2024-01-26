package com.adn.natillera.factura.modelo.dto;

import com.adn.natillera.factura.modelo.entidad.EstadoFactura;
import java.math.BigDecimal;

public record ResumenFacturaDTO(
        Long id,
        BigDecimal valorTotal,
        EstadoFactura estado
) {
}
