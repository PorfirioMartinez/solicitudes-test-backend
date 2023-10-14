package com.mx.pruebas.solicitudes.domain.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Solicitud {
	private String idSolicitud;
	private Double monto;
	private String producto;
	private String tipoSolicitudStr;
	private String idTipoSolicitud;
	private Integer tasa;
	private Integer  plazo;
	private String frecuencia;
	private String fechaSolicitud;
}
