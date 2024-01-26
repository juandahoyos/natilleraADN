package com.adn.natillera.factura.puerto.dao;

import com.adn.natillera.factura.modelo.dto.ResumenFacturaDTO;

import java.util.List;

public interface DaoFactura {

    List<ResumenFacturaDTO> obtenerResumenDeFacturasAnuladas();
}
