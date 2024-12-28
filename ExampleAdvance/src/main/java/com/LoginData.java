package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginData {
	public String authorizeLogin(LoginProject l)
	{
		
		String username=l.getUsername();
		String password = l.getPassword();
		System.out.println("logindata:"+username);
		String dbUser="";
		String dbPassword="";
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sheik","root","Sheik@3122");
			PreparedStatement ps=con.prepareStatement("select * from register1 where username=? and password=?");
			ps.setString(1,username);
			ps.setString(2,password);
			
			ResultSet rs=ps.executeQuery();
			System.out.println("resultset");
			while(rs.next())
			{
				dbUser=rs.getString("username");
				dbPassword=rs.getString("password");
				if(username.equalsIgnoreCase(dbUser)&&password.equalsIgnoreCase(dbPassword))
				{
					System.out.println("while loop running");
					return "SUCCESS LOGIN";
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "wrong username and password";
	}
	

}
