package com.spring;

import java.util.Properties;

public class Customer {

private String fullname;

public String getFullname() {
	return fullname;
}

public void setFullname(String fullname) {
	this.fullname = fullname;
}

@Override
public String toString() {
	return "Customer [fullname=" + fullname + "]";
}


	
}//dependent class
