package com.mx.pruebas.solicitudes.domain.service;

import org.springframework.stereotype.Service;

@Service
public class SolicitudServiceImpl implements SolicitudesService{
	@Override
	public String solCollection() {
		
		System.out.println("impl");
		return "OK";
	}
}
