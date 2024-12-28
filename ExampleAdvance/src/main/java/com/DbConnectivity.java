package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DbConnectivity
 */
@WebServlet("/DbConnectivity")
public class DbConnectivity extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DbConnectivity() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String f=request.getParameter("fname");
		String l=request.getParameter("lname");
		String a=request.getParameter("age");
		String g=request.getParameter("gender");
		String p=request.getParameter("phone");
		String e1=request.getParameter("email");
		String pass=request.getParameter("password");
		String c=request.getParameter("country");
		out.println(f+" "+l+" "+a+""+g+" "+p+" "+e1+" "+pass+" "+c);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sheik","root","Sheik@3122");
			PreparedStatement ps=con.prepareStatement("insert into register(fname, lname, age, gender, phone, email, password, country) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1,f);
			ps.setString(2,l);
			ps.setString(3,a);
			ps.setString(4,g);
			ps.setString(5,p);
			ps.setString(6,e1);
			ps.setString(7,pass);
			ps.setString(8,c);
			int i=ps.executeUpdate();
			
			if(i>0)
			{
				out.println("inserted successfully");
			}
			else
			{
				out.println("not inserted ");
			}
			for(i=0;i<8;i++)
			{
				ps.close();
			}
		}
	
		catch(SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
