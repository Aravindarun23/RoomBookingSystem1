package com.validation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usermail = request.getParameter("usermail");
		String userpass = request.getParameter("userpass");
		int id = 0;
		try {
			id = DBConnect.login(usermail, userpass);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		
		try {
			if (id!=0) {
				HttpSession session=request.getSession();
				session.setAttribute("userid", id);
				session.setAttribute("usermail",usermail);
				response.sendRedirect("Welcome.jsp");
			} else if (DBConnect.adminlogin(usermail,userpass)) {
				HttpSession session=request.getSession();
				session.setAttribute("usermail",usermail);
				response.sendRedirect("AdminPage.jsp");
			}
			else {
				response.setContentType("text/html");  
		        PrintWriter out=response.getWriter();
				RequestDispatcher dr=request.getRequestDispatcher("Login.jsp");
				dr.include(request, response);
				out.print("Please enter valid inputs");
				out.close();
				
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		} 
		finally 
		{
			try
			{
				DBConnect.getcon().close();
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
