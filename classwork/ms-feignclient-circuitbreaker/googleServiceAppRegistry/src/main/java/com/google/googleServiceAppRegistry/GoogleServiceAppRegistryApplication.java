package com.google.googleServiceAppRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GoogleServiceAppRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleServiceAppRegistryApplication.class, args);
	}

}
