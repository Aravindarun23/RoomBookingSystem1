package com.Adminfunction;

import com.validation.DBConnect;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminDeleteRoomServlet")
public class AdminDeleteRoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminDeleteRoomServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			AdminDeleteRoom del = new AdminDeleteRoom(DBConnect.getcon());
			if (AdminDeleteRoom.DeleteRoom(id) > 0) {
				response.sendRedirect("AdminViewRooms.jsp");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
