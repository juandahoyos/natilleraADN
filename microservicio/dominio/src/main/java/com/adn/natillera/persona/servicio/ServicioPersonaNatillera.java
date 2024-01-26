package com.adn.natillera.persona.servicio;
import com.adn.natillera.dominio.excepcion.ExcepcionDuplicidad;
import com.adn.natillera.persona.modelo.entidad.PersonaNatillera;
import com.adn.natillera.persona.puerto.dao.PersonaNatilleraDao;
import com.adn.natillera.persona.puerto.repositorio.RepositorioPersonaNatillera;

import java.util.List;

public class ServicioPersonaNatillera {

    private final RepositorioPersonaNatillera repositorioPersonaNatillera;
    private final PersonaNatilleraDao personaNatilleraDao;

    public ServicioPersonaNatillera(RepositorioPersonaNatillera repositorioPersonaNatillera,
                                    PersonaNatilleraDao personaNatilleraDao) {
        this.repositorioPersonaNatillera = repositorioPersonaNatillera;
        this.personaNatilleraDao = personaNatilleraDao;
    }

    public void crear(Long idPersona, List<PersonaNatillera> personasNatilleras) {
        crearPersonasNatilleras(idPersona, personasNatilleras);
        personasNatilleras.forEach(repositorioPersonaNatillera::guardar);
    }

    private void crearPersonasNatilleras(Long idPersona, List<PersonaNatillera> personasNatilleras){
        personasNatilleras.forEach(personaNatillera ->{
            personaNatillera.setIdPersona(idPersona);
            validarPersonasNatillera(personaNatillera);
        });
    }

    private void validarPersonasNatillera(PersonaNatillera personaNatillera){
        if(personaNatilleraDao.obtenerPersonaNatilleraPorIdPersonaYIdNatillera(personaNatillera) == null)
            throw new ExcepcionDuplicidad("La persona x ya esta en la Natillera y");
    }
}
