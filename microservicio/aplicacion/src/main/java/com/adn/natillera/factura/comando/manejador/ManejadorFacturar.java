package com.adn.natillera.factura.comando.manejador;

import com.adn.natillera.ComandoRespuesta;
import com.adn.natillera.factura.comando.ComandoSolicitudFacturar;
import com.adn.natillera.factura.comando.fabrica.FabricaSolicitudFacturar;
import com.adn.natillera.factura.servicio.ServicioFacturar;
import com.adn.natillera.manejador.ManejadorComandoRespuesta;
import org.springframework.stereotype.Component;

@Component
public class ManejadorFacturar implements ManejadorComandoRespuesta<ComandoSolicitudFacturar, ComandoRespuesta<Long>> {

    private final FabricaSolicitudFacturar fabricaSolicitudFacturar;
    private final ServicioFacturar servicioFacturar;

    public ManejadorFacturar(FabricaSolicitudFacturar fabricaSolicitudFacturar, ServicioFacturar servicioFacturar) {
        this.fabricaSolicitudFacturar = fabricaSolicitudFacturar;
        this.servicioFacturar = servicioFacturar;
    }

    @Override
    public ComandoRespuesta<Long> ejecutar(ComandoSolicitudFacturar comandoSolicitudFacturar) {
        return new ComandoRespuesta<>(servicioFacturar
                .ejecutar(fabricaSolicitudFacturar.crear(comandoSolicitudFacturar)));
    }
}
