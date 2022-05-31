package com.Userfunction;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.AssignValues.OrderDetails;


@WebServlet("/UserSearchServlet")
public class UserSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UserSearchServlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Floor = request.getParameter("floor");
		String Roomtype = request.getParameter("roomtype");
		int Cost = Integer.parseInt(request.getParameter("cost"));
		int persons = Integer.parseInt(request.getParameter("persons"));
		int rooms=Integer.parseInt(request.getParameter("rooms"));
		String checkindate = request.getParameter("checkindate");
		String checkoutdate = request.getParameter("checkoutdate");
		try {
			ArrayList<OrderDetails> ListRooms = UserSearch.UserSerachRoom(Floor, Cost, Roomtype, checkindate, checkoutdate,persons,rooms);
			request.setAttribute("roomobject", ListRooms);
			RequestDispatcher rd=request.getRequestDispatcher("UserSearchRooms.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
