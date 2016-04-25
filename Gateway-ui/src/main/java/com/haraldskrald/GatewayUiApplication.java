package com.haraldskrald;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableZuulProxy
public class GatewayUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayUiApplication.class, args);
	}
}