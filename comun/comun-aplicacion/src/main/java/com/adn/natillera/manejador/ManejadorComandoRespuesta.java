package com.adn.natillera.manejador;

import org.springframework.transaction.annotation.Transactional;

public interface ManejadorComandoRespuesta<C, R> {

	@Transactional
	R ejecutar(C comando);
}