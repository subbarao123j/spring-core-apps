package com.spring;

import java.util.Properties;

public class Employee {

	private Address address;

	
	public void setAddress(Address address) {
		this.address = address;
	}


	public Employee(Address address) {
		
		
		super();
		this.address = address;
		System.out.println("I am from constructor");
	}


	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}// dependent class
