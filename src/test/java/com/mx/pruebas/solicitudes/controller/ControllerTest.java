package com.mx.pruebas.solicitudes.controller;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.DirtiesContext;

import com.mx.pruebas.solicitudes.application.rest.SolicitudesController;
import com.mx.pruebas.solicitudes.domain.entity.RequestEstatus;
import com.mx.pruebas.solicitudes.domain.entity.RequestSolicitud;
import com.mx.pruebas.solicitudes.domain.service.SolicitudesService;

@SpringBootTest
@DirtiesContext
public class ControllerTest {
	
	@Autowired
	private SolicitudesController solicitudesController;
	
	@MockBean
	private SolicitudesService solicitudesService;
	
	@Test
	public void registrarTest() {
		when(solicitudesService.solCollection()).thenReturn("ok");
		solicitudesController.altaSolicitud(new RequestSolicitud());

		when(solicitudesService.solCollection()).thenReturn(null);
		solicitudesController.altaSolicitud(new RequestSolicitud());
	}	
	
	@Test
	public void actualizarEstatusTest() {
		when(solicitudesService.solCollection()).thenReturn("ok");
		solicitudesController.actualizarEstatus(new RequestEstatus());

		when(solicitudesService.solCollection()).thenReturn(null);
		solicitudesController.altaSolicitud(new RequestSolicitud());
	}

}
