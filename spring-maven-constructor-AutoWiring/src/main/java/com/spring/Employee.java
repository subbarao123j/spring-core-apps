package com.spring;

import java.util.Properties;

public class Employee {

private Address address;

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
