package com.spring;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {
	
	private String message;
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	
	
	@Override
	public String toString() {
		return "HelloBean [message=" + message + "]";
	}


}
 