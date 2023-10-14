package com.mx.pruebas.solicitudes.application.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.pruebas.solicitudes.domain.entity.RequestEstatus;
import com.mx.pruebas.solicitudes.domain.entity.RequestSolicitud;
import com.mx.pruebas.solicitudes.domain.service.SolicitudesService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;

@RestController
@RequestMapping(produces = { "application/json; charset=utf-8" })
public class SolicitudesController {
	private static final Logger LOGGER = LoggerFactory.getLogger(SolicitudesController.class);
	
	public static final String RESPUESTA_EXITOSO = "Servicio invocado correctamente.";
	
	@Autowired
	private SolicitudesService solicitudesService;
	
	@Operation(summary = "Alta Solicitud")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = RESPUESTA_EXITOSO, content = {
			@Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class))) }),
	@ApiResponse(responseCode = "400", description = "Bad Request", content = {
			@Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class))) }) })
	@PostMapping(value = "/alta/solicitud", consumes = { "application/json; charset=utf-8" })
	public ResponseEntity<String> altaSolicitud(@Valid @RequestBody RequestSolicitud requestSolicitud){
		LOGGER.info("Alta Solicitud");		
		
		String resultado = solicitudesService.solCollection();
		
		if(resultado !=null) {			
			return ResponseEntity.status(HttpStatus.OK).body(resultado);
		}else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al registrar");
		}		
	}
	
	@Operation(summary = "Actualizar Estatus Solicitud")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = RESPUESTA_EXITOSO, content = {
			@Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class))) }),
	@ApiResponse(responseCode = "400", description = "Bad Request", content = {
			@Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class))) }) })
	@PostMapping(value = "/estatus/solicitud", consumes = { "application/json; charset=utf-8" })
	public ResponseEntity<String> actualizarEstatus(@Valid @RequestBody RequestEstatus collection){
		LOGGER.info("Actaulizar Estatus Solicitud");		
		
		String resultado = solicitudesService.solCollection();
		
		if(resultado !=null) {			
			return ResponseEntity.status(HttpStatus.OK).body(resultado);
		}else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al registrar");
		}		
	}

}
