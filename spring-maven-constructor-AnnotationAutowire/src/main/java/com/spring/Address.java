package com.spring;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String city;

	
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		
		city= "Hyderabad";
		this.city = city;
	}


	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}

}
