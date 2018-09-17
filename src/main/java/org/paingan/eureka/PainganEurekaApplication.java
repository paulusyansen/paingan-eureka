package org.paingan.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PainganEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PainganEurekaApplication.class, args);
	}
}
