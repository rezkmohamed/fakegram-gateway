package com.fakegram.microservices.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FakegramGatewayMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FakegramGatewayMicroserviceApplication.class, args);
	}

}
