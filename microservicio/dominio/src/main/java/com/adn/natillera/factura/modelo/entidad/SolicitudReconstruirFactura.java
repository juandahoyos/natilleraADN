package com.adn.natillera.factura.modelo.entidad;

import com.adn.natillera.cliente.entidad.Cliente;

import java.math.BigDecimal;
import java.util.List;

public record SolicitudReconstruirFactura(Long id, Cliente cliente, List<ProductoFacturar> productosFacturar,
                                          BigDecimal valorTotal, EstadoFactura estadoFactura) {
}