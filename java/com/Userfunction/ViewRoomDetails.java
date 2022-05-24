package com.Userfunction;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.AssignValues.RoomDetails;

public class ViewRoomDetails {
	private Connection con;

	public ViewRoomDetails(Connection con) {
		super();
		this.con=con;
	}
	public List<RoomDetails> getAllrooms(){
		List<RoomDetails> ListOfRooms= new ArrayList<RoomDetails>();
		RoomDetails room=null;
		try {
			PreparedStatement pstmt=con.prepareStatement("SELECT * FROM public.\"RoomDetails\"");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				room=new RoomDetails();
				room.setFloor(rs.getString(1));
				room.setRoomtype(rs.getString(2));
				room.setAvailablityofrooms(rs.getString(3));
				room.setCost(rs.getInt(4));
				room.setRoomimage(rs.getString(5));
				room.setId(rs.getInt(6));
			    ListOfRooms.add(room);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ListOfRooms;
	}
	

}
