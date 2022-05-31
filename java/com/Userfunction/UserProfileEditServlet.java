package com.Userfunction;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UserProfileEditServlet")
public class UserProfileEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UserProfileEditServlet() {
        super();
      
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String usermail = (String) session.getAttribute("usermail");
		String username=request.getParameter("username");
		String usermobile=request.getParameter("usermobile");
		String useraddress=request.getParameter("useraddress");
		String userstate=request.getParameter("userstate");
		String userpincode=request.getParameter("userpincode");
		try {
			UserProfileUpdate.profileUpdate(usermail, username, usermobile, useraddress, userstate, userpincode);
			response.sendRedirect("Welcome.jsp");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
