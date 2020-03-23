package com.people.EjercicioProgramacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.people.EjercicioProgramacion.repositories")
@ComponentScan(basePackages="com.people.EjercicioProgramacion")
@EntityScan("com.people.EjercicioProgramacion.domain")
public class EjercicioProgramacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioProgramacionApplication.class, args);
	}

}
