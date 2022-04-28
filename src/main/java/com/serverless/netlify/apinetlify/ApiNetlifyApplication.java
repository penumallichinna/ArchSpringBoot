package com.serverless.netlify.apinetlify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ApiNetlifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiNetlifyApplication.class, args);
	}

}
