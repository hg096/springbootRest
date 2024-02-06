package com.springB.springBoot;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


// http://localhost:8080/sp/swagger-ui/index.html#/
@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "스프링 REST API"
				, description = "스프링으로 만든 REST API"
				, version = "v1.0"
				, contact = @Contact(
						name = "이름"
						, email = "이메일@mail.com"
						, url = ""
				)
				, license = @License(
						name = ""
						, url = ""
				)
		),
		// 외부문서 깃주소 같은거
		externalDocs = @ExternalDocumentation(
				description = ""
				, url = ""
		)
)
public class Application {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
