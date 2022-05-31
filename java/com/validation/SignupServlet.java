package com.validation;

import java.io.IOException;
import java.io.PrintWriter;

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
		  response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
		String username=request.getParameter("username");
		String useremail=request.getParameter("useremail");
		String userpass=request.getParameter("userpass");
		String usermobile=request.getParameter("usermobile");
		String useraddress=request.getParameter("useraddress");
		String userstate=request.getParameter("userstate");
		String userpincode=request.getParameter("userpincode");
		try {
			int value= DBConnect.Signup(username, useremail, userpass, usermobile,useraddress,userstate,userpincode);
			System.out.println(value);
			if(value==1) {
				  
	            request.getRequestDispatcher("Login.jsp").include(request, response);
	            out.print("Account created Successfully");
//				response.sendRedirect("Login.jsp");
			}
			else {
				response.sendRedirect("Signup.jsp");
			}
			out.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
