package com.Adminfunction;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.validation.DBConnect;

@WebServlet("/AdminAddUserServlet")
public class AdminAddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminAddUserServlet() {
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
				DBConnect.Signup(username, useremail, userpass, usermobile,useraddress,userstate,userpincode);
				request.getRequestDispatcher("UserDetailsAdmin.jsp").include(request, response);
	            out.print("Guest Added Successfully");
			} catch (SQLException e) {
				e.printStackTrace();
			}
	            
	}

}
