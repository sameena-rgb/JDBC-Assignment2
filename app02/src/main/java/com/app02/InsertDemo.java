package com.app02;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {

	public static void main(String[] args) throws Exception
	{
          Class.forName("com.mysql.cj.jdbc.Driver");
          System.out.println("driver class loaded successfully");
          
          Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","sameena-rgb");
	      System.out.println("Success");
	    PreparedStatement ps= con.prepareStatement("insert into register values('sameena','saminnunf@gmail.com','sameena-rgb','female','delhi')");
		     int i=ps.executeUpdate();
		      	if(i>0)
		      	{
		      		System.out.println("success");
		      	}
		      	else
		      	{
		      		System.out.println("failure");
		      	}
	      
	    
	}

}
