package com.Adminfunction;

import com.AssignValues.RoomDetails;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminAddRoomServlet")
public class AdminAddRoomServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public AdminAddRoomServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String Roomtype = request.getParameter("roomtype");
			String Floor = request.getParameter("floor");
			int Maxnumofperson =Integer.parseInt(request.getParameter("numberofpersons"));
			int Cost = Integer.parseInt(request.getParameter("cost"));
			String Totalbeds = request.getParameter("totalbeds");
			RoomDetails room = new RoomDetails(Roomtype, Floor, Maxnumofperson,Cost,Totalbeds);
			boolean flag = AdminAddRoom.addRooms(room);
			if (flag) {
				response.sendRedirect("AdminPage.jsp");

			} else {
				response.sendRedirect("AdminAddRoom.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
