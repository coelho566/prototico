package com.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.*")
public class PrototicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrototicoApplication.class, args);
	}

}
