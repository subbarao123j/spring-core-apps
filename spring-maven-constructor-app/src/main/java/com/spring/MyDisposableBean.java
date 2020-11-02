package com.spring;

import org.springframework.beans.factory.DisposableBean;

public class MyDisposableBean implements DisposableBean{

	public void destroy() throws Exception {
		System.out.println("MyDisposableBean");
		
	}

}
