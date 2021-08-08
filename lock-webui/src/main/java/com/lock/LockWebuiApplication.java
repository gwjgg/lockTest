package com.lock;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class LockWebuiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LockWebuiApplication.class, args);
	}

}
