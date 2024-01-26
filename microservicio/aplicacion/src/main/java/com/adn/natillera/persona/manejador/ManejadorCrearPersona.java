package com.adn.natillera.persona.manejador;

import com.adn.natillera.ComandoRespuesta;
import com.adn.natillera.manejador.ManejadorComandoRespuesta;
import com.adn.natillera.persona.comando.ComandoCrearPersona;
import com.adn.natillera.persona.fabrica.FabricaCrearPersona;
import com.adn.natillera.persona.fabrica.FabricaPersonaNatillera;
import com.adn.natillera.persona.servicio.ServicioPersona;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearPersona implements ManejadorComandoRespuesta<ComandoCrearPersona, ComandoRespuesta<Long>> {

    private final FabricaCrearPersona fabricaCrearPersona;
    private final FabricaPersonaNatillera fabricaPersonaNatillera;
    private final ServicioPersona servicioPersona;

    public ManejadorCrearPersona(FabricaCrearPersona fabricaCrearPersona,
                                 FabricaPersonaNatillera fabricaPersonaNatillera,
                                 ServicioPersona servicioPersona) {
        this.fabricaCrearPersona = fabricaCrearPersona;
        this.fabricaPersonaNatillera = fabricaPersonaNatillera;
        this.servicioPersona = servicioPersona;
    }

    @Override
    public ComandoRespuesta<Long> ejecutar(ComandoCrearPersona comandoCrearPersona) {
        return new ComandoRespuesta<Long>(servicioPersona
                .agregar(fabricaCrearPersona.crear(comandoCrearPersona), fabricaPersonaNatillera.crear(comandoCrearPersona)));
    }



}
