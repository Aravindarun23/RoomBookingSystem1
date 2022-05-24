package com.Adminfunction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.AssignValues.RoomDetails;

public class AdminUpdateRoom {
	private static Connection con;

	public AdminUpdateRoom(Connection con) {
		super();
		AdminUpdateRoom.con = con;
		
	}

	public static void updateRoom(RoomDetails room) throws SQLException {
		
			PreparedStatement pstmt = con.prepareStatement("UPDATE public.\"RoomDetails\"\r\n"
					+ "	SET \"Floor\"=?, \"RoomType\"=?, \"AvailablityOfRooms\"=?, \"Cost\"=?, \"RoomImage\"=?\r\n"
					+ "	WHERE \"Id\"=?;");
			pstmt.setString(1, room.getFloor());
			pstmt.setString(2, room.getRoomtype());
			pstmt.setString(3, room.getAvailablityofrooms());
			pstmt.setInt(4, room.getCost());
			pstmt.setString(5, room.getRoomimage());
			pstmt.setInt(6, room.getId());
			
			pstmt.executeUpdate();
		 
	}

}
