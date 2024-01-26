package com.adn.natillera.persona.fabrica;

import com.adn.natillera.persona.comando.ComandoCrearPersona;
import com.adn.natillera.persona.modelo.entidad.Persona;
import com.adn.natillera.persona.puerto.repositorio.RepositorioPersona;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class FabricaCrearPersona {

    private final RepositorioPersona repositorioPersona;

    public FabricaCrearPersona(RepositorioPersona repositorioPersona) {
        this.repositorioPersona = repositorioPersona;
    }

    public Persona crear(ComandoCrearPersona comandoCrearPersona) {
        return new Persona(comandoCrearPersona.getNombres(), comandoCrearPersona.getApellidos(), comandoCrearPersona.getTipoDocumento(),
                comandoCrearPersona.getNumeroDocumento(), comandoCrearPersona.getCelular(),comandoCrearPersona.getCorreo(),
                LocalDateTime.now(), Boolean.TRUE);
    }
}
