package com.Userfunction;

import java.io.IOException;
import com.AssignValues.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UserBookingServlet")
public class UserBookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserBookingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String floor = request.getParameter("floor");
		String roomtype = request.getParameter("roomtype");
		int cost = Integer.parseInt(request.getParameter("price"));
		int persons = Integer.parseInt(request.getParameter("person"));
		int rooms=Integer.parseInt(request.getParameter("rooms"));
		String checkindate = request.getParameter("checkindate");
		String checkoutdate = request.getParameter("checkoutdate");
		int totaldate = Integer.parseInt(request.getParameter("totaldays"));
		int totalamount=Integer.parseInt(request.getParameter("totalamount"));
		int roomid=Integer.parseInt(request.getParameter("roomid"));
		OrderDetails order=UserBooking.placeOrder(roomtype,floor,cost,persons,rooms,checkindate,checkoutdate,totaldate,totalamount,roomid);
		HttpSession session=request.getSession();
		session.setAttribute("orderdetails",order);
		RequestDispatcher rd=request.getRequestDispatcher("ViewRoomDetails.jsp");
		rd.forward(request, response);

		
		
	
	}

}
