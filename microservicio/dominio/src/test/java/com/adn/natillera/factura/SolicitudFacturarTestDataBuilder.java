package com.adn.natillera.factura;

import com.adn.natillera.cliente.entidad.Cliente;
import com.adn.natillera.factura.modelo.entidad.ProductoFacturar;
import com.adn.natillera.factura.modelo.entidad.SolicitudFacturar;

import java.util.ArrayList;
import java.util.List;

public class SolicitudFacturarTestDataBuilder {

    private List<ProductoFacturar> productosFacturar;
    private Cliente cliente;

    public SolicitudFacturarTestDataBuilder() {
        this.productosFacturar = new ArrayList<>();
    }

    public SolicitudFacturarTestDataBuilder conProductoFacturar(ProductoFacturar productoFacturar) {
        this.productosFacturar.add(productoFacturar);
        return this;
    }

    public SolicitudFacturarTestDataBuilder conProductosFacturar(List<ProductoFacturar> productosFacturar) {
        this.productosFacturar = productosFacturar;
        return this;
    }

    public SolicitudFacturarTestDataBuilder conCliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }

    public SolicitudFacturar build() {
        return new SolicitudFacturar(cliente, productosFacturar);
    }

}
