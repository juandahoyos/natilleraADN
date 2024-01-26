package com.adn.natillera.factura.servicio;

import com.adn.natillera.factura.modelo.entidad.Factura;
import com.adn.natillera.factura.modelo.entidad.SolicitudFacturar;
import com.adn.natillera.factura.puerto.repositorio.RepositorioFactura;

public class ServicioFacturar {
    private final RepositorioFactura repositorioFactura;

    public ServicioFacturar(RepositorioFactura repositorioFactura) {
        this.repositorioFactura = repositorioFactura;
    }

    public Long ejecutar(SolicitudFacturar solicitudFacturar) {
        Factura factura = Factura.crear(solicitudFacturar);
        return repositorioFactura.guardar(factura);
    }
}
