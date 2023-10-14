package com.mx.pruebas.solicitudes.utils;
import org.junit.jupiter.api.Test;
import org.meanbean.test.BeanTester;
import org.springframework.boot.test.context.SpringBootTest;

import com.mx.pruebas.solicitudes.domain.entity.Cliente;
import com.mx.pruebas.solicitudes.domain.entity.RequestEstatus;
import com.mx.pruebas.solicitudes.domain.entity.RequestSolicitud;
import com.mx.pruebas.solicitudes.domain.entity.Solicitud;

@SpringBootTest
public class PojosTest {
	@Test
	public void testSetGetAll() {
		BeanTester testPojo = new BeanTester();
		testPojo.testBean(Cliente.class);
		testPojo.testBean(Solicitud.class);
		testPojo.testBean(RequestSolicitud.class);
		testPojo.testBean(RequestEstatus.class);
	}
}
