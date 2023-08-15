package com.in28minutes;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootRestfulWebservices2Application {

	@Bean
public ModelMapper modelMapper(){
		return new ModelMapper();	
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestfulWebservices2Application.class, args);
	}

}
