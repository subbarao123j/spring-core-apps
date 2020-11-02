package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {
	
	
	
	@Bean
	
	public Employee employee() {
		
		
		return new Employee();
	}
	
	@Bean
	
	public Address address() {
		
		
		return new Address();
	}
	
}
