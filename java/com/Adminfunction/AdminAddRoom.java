package com.Adminfunction;
import java.sql.*;

import com.AssignValues.RoomDetails;

public class AdminAddRoom {
	static Connection con;

	public AdminAddRoom(Connection con) {
		super();
		AdminAddRoom.con = con;
	}

	public static boolean addRooms(RoomDetails room) {
		boolean flag = false;
		try {
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO public.\"RoomDetails\"(\r\n"
					+ "	\"Floor\", \"RoomType\", \"AvailablityOfRooms\", \"Cost\", \"RoomImage\")\r\n"
					+ "	VALUES (?, ?, ?, ?, ?);");
			pstmt.setString(1, room.getFloor());
			pstmt.setString(2, room.getRoomtype());
			pstmt.setString(3, room.getAvailablityofrooms());
			pstmt.setInt(4, room.getCost());
			pstmt.setString(5, room.getRoomimage());
			int i = pstmt.executeUpdate();
			if (i == 1) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;

	}
}
