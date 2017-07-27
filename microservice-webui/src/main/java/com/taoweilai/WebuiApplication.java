package com.taoweilai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
/*@RestController*/
@EnableAutoConfiguration
public class WebuiApplication {
	
	/*@Autowired
	private DiscoveryClient client;
	@GetMapping("/info")
	public ServiceInstance showInfo() {
		return client.getLocalServiceInstance();
	}
	
//	@GetMapping("/login/login")
	//@PostMapping("/login/login")
	@RequestMapping("/login/login")
	public ServiceInstance login() {
		System.out.println("login");
		return client.getLocalServiceInstance();
	}*/
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(WebuiApplication.class, args);
	}
}
