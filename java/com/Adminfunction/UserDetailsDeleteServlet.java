package com.Adminfunction;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserDetailsDeleteServlet")
public class UserDetailsDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UserDetailsDeleteServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("userid"));
		UserDetailsDelete.DeleteUser(id);
		response.sendRedirect("UserDetailsAdmin.jsp");
		
	}
}

