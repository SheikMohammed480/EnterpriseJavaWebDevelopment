package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterData {
		public String authorizeRegister(RegisterProject r)
		{
			
			String firstName1=r.getFirstName();
			String lastName1= r.getLastName();
			String username1= r.getUsername();
			String password1= r.getPassword();
			System.out.println(firstName1);
			try {
				
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sheik","root","Sheik@3122");
					PreparedStatement ps=con.prepareStatement("insert into register1(username,password,firstName,lastName) values(?,?,?,?)");
					ps.setString(1,username1);
					ps.setString(2,password1);
					ps.setString(3,firstName1);
					ps.setString(4,lastName1);
					int i=ps.executeUpdate();
					if(i>0)
					{
						System.out.println("successfully Register");
						return "SUCCESSFULLY REGISTERED";
					}
				
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			
			return "REGISTER FAILURE";
		}
	
}
