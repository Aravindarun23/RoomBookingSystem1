package com.Userfunction;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.AssignValues.RoomDetails;

public class UserSearch {
	private static Connection con;
	public UserSearch(Connection con) {
		super();
		UserSearch.con=con;
	}
	
	public static List<RoomDetails> UserSerachRoom(String Floor,String Cost,String Roomtype) throws SQLException {
		List<RoomDetails> ListOfRooms= new ArrayList<RoomDetails>();
		RoomDetails room=null;
		PreparedStatement pstmt=con.prepareStatement("SELECT * FROM public.\"RoomDetails\" WHERE \"RoomType\"=? AND \"Floor\"=? AND  \"Cost\"<=? ");
		pstmt.setString(1, Roomtype);
		pstmt.setString(2, Floor);
		pstmt.setInt(3, Integer.parseInt(Cost));
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			room=new RoomDetails(rs.getInt(6),rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5));
			ListOfRooms.add(room);
			
		}
		return ListOfRooms;
		
	}
	

}
