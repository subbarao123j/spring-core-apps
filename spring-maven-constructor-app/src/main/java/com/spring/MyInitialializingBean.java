package com.spring;

import org.springframework.beans.factory.InitializingBean;

public class MyInitialializingBean implements InitializingBean{

	public void afterPropertiesSet() throws Exception {

System.out.println("my initlalizing bean");
		
	}

}
