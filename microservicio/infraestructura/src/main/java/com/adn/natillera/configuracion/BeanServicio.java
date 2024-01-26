package com.adn.natillera.configuracion;


import com.adn.natillera.factura.puerto.repositorio.RepositorioFactura;
import com.adn.natillera.factura.servicio.ServicioAnular;
import com.adn.natillera.factura.servicio.ServicioFacturar;
import com.adn.natillera.persona.puerto.dao.PersonaDao;
import com.adn.natillera.persona.puerto.dao.PersonaNatilleraDao;
import com.adn.natillera.persona.puerto.repositorio.RepositorioPersona;
import com.adn.natillera.persona.puerto.repositorio.RepositorioPersonaNatillera;
import com.adn.natillera.persona.servicio.ServicioPersona;
import com.adn.natillera.persona.servicio.ServicioPersonaNatillera;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicio {

    @Bean
    public ServicioFacturar servicioFacturar(RepositorioFactura repositorioFactura) {
        return new ServicioFacturar(repositorioFactura);
    }

    @Bean
    public ServicioAnular servicioAnular(RepositorioFactura repositorioFactura) {
        return new ServicioAnular(repositorioFactura);
    }

    @Bean
    public ServicioPersona servicioPersona(RepositorioPersona repositorioPersona,
                                           PersonaDao personaDao,
                                           ServicioPersonaNatillera servicioPersonaNatillera) {
        return new ServicioPersona(repositorioPersona, personaDao, servicioPersonaNatillera);
    }

    @Bean
    public ServicioPersonaNatillera servicioPersonaNatillera(RepositorioPersonaNatillera repositorioPersonaNatillera,
                                                             PersonaNatilleraDao personaNatilleraDao) {
        return new ServicioPersonaNatillera(repositorioPersonaNatillera, personaNatilleraDao);
    }

} 
