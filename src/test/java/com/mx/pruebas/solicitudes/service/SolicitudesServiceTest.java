package com.mx.pruebas.solicitudes.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mx.pruebas.solicitudes.domain.service.SolicitudesService;

@SpringBootTest
public class SolicitudesServiceTest {
	
	@Autowired
	private SolicitudesService solicitudesService;
	
	@Test
	public void solicitudCollectionTest() {
		solicitudesService.solCollection();
	}
}
