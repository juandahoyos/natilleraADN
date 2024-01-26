package com.adn.natillera.persona.fabrica;

import com.adn.natillera.persona.comando.ComandoCrearPersona;
import com.adn.natillera.persona.modelo.entidad.EstadoPersonaNatillera;
import com.adn.natillera.persona.modelo.entidad.PersonaNatillera;
import com.adn.natillera.persona.puerto.repositorio.RepositorioPersonaNatillera;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Function;

@Component
public class FabricaPersonaNatillera {

    private final RepositorioPersonaNatillera repositorioPersonaNatillera;

    public FabricaPersonaNatillera(RepositorioPersonaNatillera repositorioPersonaNatillera) {
        this.repositorioPersonaNatillera = repositorioPersonaNatillera;
    }

    public List<PersonaNatillera> crear(ComandoCrearPersona comandoCrearPersona) {
        return comandoCrearPersona.getIdsNatilleras().stream().map(getPersonaNatillera).toList();
    }

    private final Function<Integer, PersonaNatillera> getPersonaNatillera = idNatillera -> new PersonaNatillera(idNatillera, EstadoPersonaNatillera.ACTIVA);

}
