package com.Adminfunction;
import com.AssignValues.RoomDetails;
import com.validation.DBConnect;
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
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String Floor=request.getParameter("floor");
			String Roomtype=request.getParameter("roomtype");
			String Availablityofrooms=request.getParameter("availablityofrooms");
			int Cost=Integer.parseInt(request.getParameter("cost"));
			String Roomimage=request.getParameter("roomimage");
			RoomDetails room=new RoomDetails(Floor,Roomtype,Availablityofrooms,Cost,Roomimage);  
			AdminAddRoom add=new AdminAddRoom(DBConnect.getcon());
			boolean flag=AdminAddRoom.addRooms(room);
			if(flag) {
				response.sendRedirect("AdminPage.jsp");
				
			}
			else {
				response.sendRedirect("AddRoom.jsp");
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
	
	}

}
