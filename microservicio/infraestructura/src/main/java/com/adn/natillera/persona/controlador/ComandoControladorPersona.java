package com.adn.natillera.persona.controlador;

import com.adn.natillera.ComandoRespuesta;
import com.adn.natillera.persona.comando.ComandoCrearPersona;
import com.adn.natillera.persona.manejador.ManejadorCrearPersona;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
@Tag(name = "Controlador comando persona")
public class ComandoControladorPersona {

    @Autowired
    private ManejadorCrearPersona manejadorCrearPersona;

    @PostMapping
    public ComandoRespuesta<Long> crearPersona (@RequestBody ComandoCrearPersona comandoCrearPersona) {
        return this.manejadorCrearPersona.ejecutar(comandoCrearPersona);
    }
}
