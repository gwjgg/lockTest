package com.lock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LockRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(LockRegisterApplication.class, args);
	}

}
