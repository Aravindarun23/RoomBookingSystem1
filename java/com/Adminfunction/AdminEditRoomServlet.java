package com.Adminfunction;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.AssignValues.RoomDetails;

@WebServlet("/AdminEditRoomServlet")
public class AdminEditRoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminEditRoomServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int id=Integer.parseInt(request.getParameter("id"));
			String Roomtype=request.getParameter("roomtype");
			String Floor=request.getParameter("floor");
			int Maxnumofperson = Integer.parseInt(request.getParameter("numberofpersons"));
			int Cost=Integer.parseInt(request.getParameter("cost"));
			String totalbeds=request.getParameter("totalbeds");
			RoomDetails room=new RoomDetails(id,Roomtype,Floor,Maxnumofperson,Cost,totalbeds);  
			AdminUpdateRoom.updateRoom(room);
	}catch(Exception e) {
		e.printStackTrace();
	}
		response.sendRedirect("AdminViewRooms.jsp");

}
}
