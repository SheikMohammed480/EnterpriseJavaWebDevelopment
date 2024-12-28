package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterControl
 */
@WebServlet("/RegisterControl")
public class RegisterControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterControl() {
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
		response.setContentType("text/html");
		if(request.getParameter("btn-register")!=null)
		{
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			System.out.println("register control:"+firstName);
			RegisterProject r=new RegisterProject();
			r.setFirstName(firstName);
			r.setLastName(lastName);
			r.setUsername(username);
			r.setPassword(password);
			System.out.println("register control get:"+r.getFirstName());
			
			RegisterData rd=new RegisterData();
			String registerValidate=rd.authorizeRegister(r);
			if(registerValidate.equals("SUCCESSFULLY REGISTERED"))
			{
				HttpSession session=request.getSession();
				session.setAttribute("first",firstName);
				session.setAttribute("last",lastName);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("LoginPage.jsp");
				requestDispatcher.forward(request, response);
				
			
			}
			
			else
			{
				
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("RegisterPage.jsp");
				requestDispatcher.include(request, response);
			}
		}
	}

}
