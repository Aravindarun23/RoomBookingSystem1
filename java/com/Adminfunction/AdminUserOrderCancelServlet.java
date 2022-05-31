package com.Adminfunction;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdminUserOrderCancelServlet")
public class AdminUserOrderCancelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminUserOrderCancelServlet() {
        super();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		try {
			AdminUserOrderCancel.orderCancel(id);
			response.sendRedirect("OrderDetailsAdmin.jsp");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
