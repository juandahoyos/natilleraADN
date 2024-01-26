package com.adn.natillera.factura.comando.manejador;

import com.adn.natillera.factura.comando.ComandoAnular;
import com.adn.natillera.factura.puerto.repositorio.RepositorioFactura;
import com.adn.natillera.factura.servicio.ServicioAnular;
import com.adn.natillera.manejador.ManejadorComando;
import org.springframework.stereotype.Component;

@Component
public class ManejadorAnular implements ManejadorComando<ComandoAnular> {

    private final ServicioAnular servicioAnular;
    private final RepositorioFactura repositorioFactura;

    public ManejadorAnular(ServicioAnular servicioAnular, RepositorioFactura repositorioFactura) {
        this.servicioAnular = servicioAnular;
        this.repositorioFactura = repositorioFactura;
    }

    @Override
    public void ejecutar(ComandoAnular comandoAnular) {
        servicioAnular.ejecutar(repositorioFactura.obtener(comandoAnular.idFactura()));
    }
}
