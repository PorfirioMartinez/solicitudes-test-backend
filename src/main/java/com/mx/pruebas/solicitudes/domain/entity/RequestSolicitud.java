package com.mx.pruebas.solicitudes.domain.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestSolicitud {
	private String promotor;
	private String empresa;
	private Cliente cliente;
	private Solicitud solicitud;

}
