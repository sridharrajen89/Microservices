package com.skills.skills_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SkillsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkillsServiceApplication.class, args);
	}

}
