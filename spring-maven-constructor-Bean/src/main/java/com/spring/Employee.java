package com.spring;


public class Employee {

	
	
	private Address address;  //dependency 

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	
	
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	
	
	
}//dependent class
