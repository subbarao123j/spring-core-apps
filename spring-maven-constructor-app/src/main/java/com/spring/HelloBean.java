package com.spring;

public class HelloBean {

	private String message;
	


	public HelloBean(String message) {
		super();
		this.message = message;
	}

	public static HelloBean createInstance() {
		
		System.out.println("Welcome to Spring");
		System.out.println("some business code is exexuting");
		//some Business code

		return new HelloBean("Bean using static factory method");
	}


}
