package com.adn.natillera.factura.servicio;

import com.adn.natillera.dominio.ValidadorArgumento;
import com.adn.natillera.factura.modelo.entidad.Factura;
import com.adn.natillera.factura.puerto.repositorio.RepositorioFactura;

public class ServicioAnular {

    private final RepositorioFactura repositorioFactura;

    public ServicioAnular(RepositorioFactura repositorioFactura) {
        this.repositorioFactura = repositorioFactura;
    }

    public void ejecutar(Factura factura) {
        ValidadorArgumento.validarObligatorio(factura, "No existe una factura para anular");
        factura.anular();
        repositorioFactura.actualizarEstado(factura);
    }
}
