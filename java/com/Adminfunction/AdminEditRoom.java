package com.Adminfunction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.AssignValues.RoomDetails;

public class AdminEditRoom {
	private static Connection con;

	public AdminEditRoom(Connection con) {
		super();
		AdminEditRoom.con=con;
	}
	public static RoomDetails getRoomById(int id) {
		RoomDetails room=null;
		try {
			PreparedStatement pstmt=con.prepareStatement("SELECT * FROM public.\"RoomDetails\" WHERE \"Id\"=?;");
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
			rs.next();
			room=new RoomDetails(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5));
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return room;
	}

}
