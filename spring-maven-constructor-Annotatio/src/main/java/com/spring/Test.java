package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		
	
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		HelloBean helloBean = (HelloBean)context.getBean(HelloBean.class);
		helloBean.setMessage("hello spring");
		System.out.println(helloBean);
		
	}

}
