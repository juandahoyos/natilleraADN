package com.adn.natillera.factura.consulta;

import com.adn.natillera.factura.modelo.dto.ResumenFacturaDTO;
import com.adn.natillera.factura.puerto.dao.DaoFactura;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorConsultarFacturasAnuladas {

    private final DaoFactura daoFactura;

    public ManejadorConsultarFacturasAnuladas(DaoFactura daoFactura) {
        this.daoFactura = daoFactura;
    }

    public List<ResumenFacturaDTO> ejecutar(){
        return daoFactura.obtenerResumenDeFacturasAnuladas();
    }
}
