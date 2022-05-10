package com.indiabix.crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Retrieve  {

	public static void main(String[] args)
	{
		String dbURL="jdbc:mysql://localhost:3306/Cg1";
		String username="root";
		String password="3kb15cs056";
		 
		try 
		{
		 
		    Connection con = DriverManager.getConnection(dbURL, username, password);
		 String sql="SELECT *FROM EMPLOYEE32";
		 Statement st=con.createStatement();
			ResultSet r=st.executeQuery(sql);
			int count=1;
			while(r.next())
			{
	
				String name=r.getString(2);
				String password1=r.getString(3);
				String emaill=r.getString(4);
				
				String result="USER: %d %s %s %s";
				System.out.println(String.format(result,count++,name,password1,emaill));
			}
			con.close();
		}
		    /* String sql = "INSERT INTO EMPLOYEE32(user_name,password,email)values(?,?,?)";
		    PreparedStatement s = con.prepareStatement(sql);
		   
		    s.setString(1, "Hrithik_j12");
		    s.setString(2, "Pass@123");
		    s.setString(3, "Hrithik@gmail.com");
		    
		    int rows=s.executeUpdate();
		    if(rows>0)
		    {
		    	System.out.println("A new User information entered successfully");
		    	
		    }
		    con.close();*/
		
		catch(SQLException e)
		{
			System.out.println("Exception occured" +e);
		
		    
		}
		
		
	}

}
