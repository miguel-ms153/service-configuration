package com.miguelmaldonado.uisrael.msa.ms_solicitudes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsSolicitudesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSolicitudesApplication.class, args);
	}

}
