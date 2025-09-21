package com.hotel.mgmt.apigateway.Apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApigatewayApplication {

	public static void main(String[] args) {
        System.out.println("ApiGateway Application Started ..............! ");
		SpringApplication.run(ApigatewayApplication.class, args);
	}

}
 