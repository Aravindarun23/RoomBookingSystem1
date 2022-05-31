package com.Userfunction;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserOrderCancelServlet")
public class UserOrderCancelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public UserOrderCancelServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		try {
			UserOrderCancel.orderCancel(id);
			response.sendRedirect("UserBookings.jsp");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
