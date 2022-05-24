package com.validation;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		try {
			int value = DBConnect.Validation(usermail, userpass);
			if (value == 1) {
				response.sendRedirect("Welcome.jsp");
			} else if (value == 2) {
				response.sendRedirect("AdminPage.jsp");
			}
			else {
				response.sendRedirect("Login.jsp");
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
