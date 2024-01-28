package com.oneoonecode.swaggercrashcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import io.swagger.v3.oas.models.annotations.OpenAPI30;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(title = "TodoItems API", version = "1.0.0"),
		servers = {@Server(url = "http://localhost:8080"), @Server(url = "one.one.com:8080") },
		tags = {@Tag(name = "TodoItems",description = "This is the to do item desc....")}
		)

@SecurityScheme(name="BearerJWT", type = SecuritySchemeType.HTTP, scheme = "bearer", bearerFormat = "JWT", description = "Bearer token for the project")
public class SwaggercrashcourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggercrashcourseApplication.class, args);
	}
}