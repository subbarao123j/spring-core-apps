package com.spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {
	
	public static void main(String[] args) {
		
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/springtest","root","Subbarao1516");
			 
			 System.out.println("DB Connected");
			 
			 
		} catch (ClassNotFoundException e) {
		
			System.out.println("Driver class NOT Loaded or respective jar not availabile  ");
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		if (connection !=null) {
	
		
		
		
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("DB Connection Closed");
		
	}
	}
	

}
