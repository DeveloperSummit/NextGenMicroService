package com.hotel.mgmt.hotel.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@ EnableDiscoveryClient
public class HotelServiceApplication {

	public static void main(String[] args) {

        System.out.println("Hotel Service Started.....!");
		SpringApplication.run(HotelServiceApplication.class, args);
	}

}
