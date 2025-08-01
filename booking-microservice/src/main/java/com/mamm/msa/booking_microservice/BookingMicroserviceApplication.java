package com.mamm.msa.booking_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookingMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingMicroserviceApplication.class, args);
	}

}
