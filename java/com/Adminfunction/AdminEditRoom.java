package com.Adminfunction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.AssignValues.RoomDetails;
import com.validation.DBConnect;

public class AdminEditRoom {
	private static Connection con=DBConnect.getcon();
	public static RoomDetails getRoomById(int id) {
		RoomDetails room=null;
		try {
			PreparedStatement pstmt=con.prepareStatement("SELECT * FROM public.\"RoomDetails\" WHERE \"id\"=?;");
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
			rs.next();
			room=new RoomDetails(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(6));			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return room;
	}

}
