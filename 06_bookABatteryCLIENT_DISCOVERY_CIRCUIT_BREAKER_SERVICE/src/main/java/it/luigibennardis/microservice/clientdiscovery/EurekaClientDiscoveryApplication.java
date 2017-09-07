package it.luigibennardis.microservice.clientdiscovery;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
//***ADD ENABLED CIRCUITBREAKER HYSTRIX SUPPORT
@EnableCircuitBreaker
@EnableEurekaClient
public class EurekaClientDiscoveryApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientDiscoveryApplication.class, args);
	}

	
}



