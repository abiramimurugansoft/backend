package com.ServiceRegistry.DMartServiceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DMartServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DMartServiceRegistryApplication.class, args);
	}

}
