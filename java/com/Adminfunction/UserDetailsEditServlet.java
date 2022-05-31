package com.Adminfunction;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserDetailsEditServlet")
public class UserDetailsEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UserDetailsEditServlet() {
        super();
        
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int userid=Integer.parseInt(request.getParameter("id"));
		String username=request.getParameter("username");
		String usermobile=request.getParameter("usermobile");
		String useraddress=request.getParameter("useraddress");
		String userstate=request.getParameter("userstate");
		String userpincode=request.getParameter("userpincode");
		try {
			UserDetailsUpdate.detailsUpdate(userid, username, usermobile, useraddress, userstate, userpincode);
			response.sendRedirect("AdminPage.jsp");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
