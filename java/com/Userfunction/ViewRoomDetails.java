package com.Userfunction;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.AssignValues.RoomDetails;
import com.validation.DBConnect;

public class ViewRoomDetails {
	private static Connection con=DBConnect.getcon();
	
	public static List<RoomDetails> getAllrooms(){
		List<RoomDetails> ListOfRooms= new ArrayList<RoomDetails>();
		RoomDetails room=null;
		try {
			PreparedStatement pstmt=con.prepareStatement("SELECT  * FROM public.\"RoomDetails\";");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				room=new RoomDetails();
				room.setRoomtype(rs.getString(1));
				room.setFloor(rs.getString(2));
				room.setMaxnumberofperson(rs.getInt(3));
				room.setCost(rs.getInt(4));
				room.setId(rs.getInt(5));
			    ListOfRooms.add(room);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ListOfRooms;
	}
	

}
