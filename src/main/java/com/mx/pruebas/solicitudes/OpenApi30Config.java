package com.mx.pruebas.solicitudes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class OpenApi30Config {

	@Bean
	public OpenAPI customOpenAPI() {
		
		final String securitySchemeName = "Demo Microservice";
		final String apiTitle = String.format("%s API", StringUtils.capitalize("Demo Microservice"));
		
		return new OpenAPI().addSecurityItem(new SecurityRequirement().addList(securitySchemeName))
				.components(new Components().addSecuritySchemes(securitySchemeName,
						new SecurityScheme().name(securitySchemeName).type(SecurityScheme.Type.HTTP).scheme("demoMicroservice")
								.bearerFormat("JWT")))
				.info(new Info().title(apiTitle).version("1.0.0")
				.description("Management Service -> Demo Microservice"));
	}

}