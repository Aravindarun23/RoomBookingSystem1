package com.validation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public SignupServlet() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String useremail=request.getParameter("useremail");
		String userpass=request.getParameter("userpass");
		String usermobile=request.getParameter("usermobile");
		try {
			int value= DBConnect.Signup(username, useremail, userpass, usermobile);
			System.out.println(value);
			if(value==1) {
				response.sendRedirect("Login.jsp");
			}
			else {
				response.sendRedirect("Signup.jsp");
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
