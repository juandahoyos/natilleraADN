package com.adn.natillera.persona.servicio;

import com.adn.natillera.persona.modelo.dto.PersonaDto;
import com.adn.natillera.persona.puerto.dao.PersonaDao;
import com.adn.natillera.persona.modelo.entidad.Persona;
import com.adn.natillera.persona.modelo.entidad.PersonaNatillera;
import com.adn.natillera.persona.puerto.repositorio.RepositorioPersona;

import java.util.List;
public class ServicioPersona {

    private final RepositorioPersona repositorioPersona;
    private final PersonaDao personaDao;

    private final ServicioPersonaNatillera servicioPersonaNatillera;

    public ServicioPersona(RepositorioPersona repositorioPersona,
                           PersonaDao personaDao,
                           ServicioPersonaNatillera servicioPersonaNatillera) {
        this.repositorioPersona = repositorioPersona;
        this.personaDao = personaDao;
        this.servicioPersonaNatillera = servicioPersonaNatillera;
    }

    public Long agregar(Persona persona, List<PersonaNatillera> personasNatilleras) {
        Long idPersona = 0L;
        PersonaDto personaDto = personaDao.obtenerPersonaPorNumeroDocumento(persona.getNumeroDocumento());
        if(personaDto == null)
            idPersona = repositorioPersona.guardar(persona);
        else
            idPersona =personaDto.getIdPersona();

        servicioPersonaNatillera.crear(idPersona, personasNatilleras);
        return idPersona;
    }
}
