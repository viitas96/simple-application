package com.clima.crudapplication;

import com.clima.crudapplication.service.MockService;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudApplication {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Bean
	public MockService mockService() {
		return new MockService();
	}

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

}
