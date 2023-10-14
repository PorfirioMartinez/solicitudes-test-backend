package com.mx.pruebas.solicitudes.domain.entity;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestEstatus {
	private String idSolicitusd;
	private String idEstatus;
	private List<Map<?,?>>motivo;
	private String fechaCambio;
}
