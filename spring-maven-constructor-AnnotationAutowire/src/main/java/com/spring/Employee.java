package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Employee {
	
	@Autowired
	
	private Address address;

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	

}
