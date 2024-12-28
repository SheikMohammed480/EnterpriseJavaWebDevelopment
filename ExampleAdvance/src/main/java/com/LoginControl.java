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
 * Servlet implementation class LoginControl
 */
@WebServlet("/LoginControl")
public class LoginControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginControl() {
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
		if(request.getParameter("btn-login")!=null)
		{
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			System.out.println("loginControl:"+username+""+password);
			LoginProject l=new LoginProject();
			l.setUsername(username);
			l.setPassword(password);
			System.out.println(l.getUsername()+""+l.getPassword());
			
			LoginData ld=new LoginData();
			String loginValidate=ld.authorizeLogin(l);
			if(loginValidate.equalsIgnoreCase("SUCCESS LOGIN"))
			{
				System.out.println("success login");
				HttpSession session=request.getSession();
				session.setAttribute("Login",l.getUsername());
				
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("SignOut.jsp");
				requestDispatcher.forward(request, response);
			
			}
			
			else
			{
				System.out.println("failure");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("RegisterPage.jsp");
				requestDispatcher.include(request, response);
			}
		}
	}

}
