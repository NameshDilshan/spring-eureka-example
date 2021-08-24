package com.namesh.amazonserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AmazonserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonserverApplication.class, args);
	}

}
