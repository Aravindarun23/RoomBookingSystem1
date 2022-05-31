package com.Adminfunction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.AssignValues.RoomDetails;
import com.validation.DBConnect;

public class AdminUpdateRoom {
	private static Connection con=DBConnect.getcon();

	public static void updateRoom(RoomDetails room) throws SQLException {
		
			PreparedStatement pstmt = con.prepareStatement("UPDATE public.\"RoomDetails\"\r\n"
					+ "	SET roomtype=?, floor=?, numberofpersons=?, price=?, totalbeds=?\r\n"
					+ "	WHERE id=?;");
			pstmt.setString(1, room.getRoomtype());
			pstmt.setString(2, room.getFloor());
			pstmt.setInt(3, room.getMaxnumberofperson());
			pstmt.setInt(4, room.getCost());
			pstmt.setString(5, room.getTotalbeds());
			pstmt.setInt(6, room.getId());
			pstmt.executeUpdate();
		 
	}

}
