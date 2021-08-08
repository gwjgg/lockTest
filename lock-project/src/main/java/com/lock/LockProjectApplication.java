package com.lock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LockProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(LockProjectApplication.class, args);
	}

}
