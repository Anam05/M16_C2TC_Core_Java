package com.indiabix.crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CrudDb {

	public static void main(String[] args)
	{
		String dbURL="jdbc:mysql://localhost:3306/Cg1";
		String username="root";
		String password="3kb15cs056";
		 
		try 
		{
		 
		    Connection con = DriverManager.getConnection(dbURL, username, password);
		    String sql = "INSERT INTO EMPLOYEE32(user_name,password,email)values(?,?,?)";
		    PreparedStatement s = con.prepareStatement(sql);
		   
		    s.setString(1, "Hrithik_j12");
		    s.setString(2, "Pass@123");
		    s.setString(3, "Hrithik@gmail.com");
		    
		    int rows=s.executeUpdate();
		    if(rows>0)
		    {
		    	System.out.println("A new User information entered successfully");
		    	
		    }
		    con.close();
		}
		catch(SQLException e)
		{
			System.out.println("Exception occured" +e);
		
		    
		}
		
		
	}

}
