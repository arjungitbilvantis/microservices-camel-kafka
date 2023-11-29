package com.bilvantis.microservices.camelmicroserviceb;

import org.apache.camel.spring.boot.CamelSpringBootApplicationController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CamelMicroserviceBApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelMicroserviceBApplication.class, args);

	}

}
