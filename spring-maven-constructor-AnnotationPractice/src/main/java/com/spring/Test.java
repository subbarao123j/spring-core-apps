package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		HelloBean helloBean=(HelloBean)context.getBean(HelloBean.class);
		
		helloBean.setMessage("HelloSPRING");
		
		System.out.println(helloBean);
		
	}
	
	


}
