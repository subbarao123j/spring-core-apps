package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		String paths[] = {"applicationContext.xml"};
		
		 
ApplicationContext context = new ClassPathXmlApplicationContext(paths);

DataDAOFactory daoFactory=(DataDAOFactory)context.getBean("fileDAOFactory");

DataDAO dao = daoFactory.getDAO();

System.out.println(dao.save("Some data"));



DataDAOFactory daoFactory2=(DataDAOFactory)context.getBean("dbDAOFactory");

DataDAO dao2 = daoFactory2.getDAO();

System.out.println(dao2.save("Some data"));
		
		
	}
	

}
