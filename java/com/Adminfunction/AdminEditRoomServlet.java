package com.Adminfunction;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.AssignValues.RoomDetails;
import com.validation.DBConnect;

@WebServlet("/AdminEditRoomServlet")
public class AdminEditRoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminEditRoomServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int id=Integer.parseInt(request.getParameter("id"));
			String Floor=request.getParameter("floor");
			String Roomtype=request.getParameter("roomtype");
			String Availablityofrooms=request.getParameter("availablityofrooms");
			int Cost=Integer.parseInt(request.getParameter("cost"));
			String Roomimage=request.getParameter("roomimage");
			RoomDetails room=new RoomDetails(id,Floor,Roomtype,Availablityofrooms,Cost,Roomimage);  
			AdminUpdateRoom update=new AdminUpdateRoom(DBConnect.getcon());
			AdminUpdateRoom.updateRoom(room);
	}catch(Exception e) {
		e.printStackTrace();
	}
		response.sendRedirect("AdminViewRooms.jsp");

}
}
