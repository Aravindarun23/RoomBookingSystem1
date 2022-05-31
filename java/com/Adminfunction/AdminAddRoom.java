package com.Adminfunction;
import java.sql.*;

import com.AssignValues.RoomDetails;
import com.validation.DBConnect;

public class AdminAddRoom {
	static Connection con=DBConnect.getcon();


	public static boolean addRooms(RoomDetails room) {
		boolean flag = false;
		try {
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO public.\"RoomDetails\"(\r\n"
					+ "	roomtype, floor, numberofpersons, price,totalbeds)\r\n"
					+ "	VALUES (?, ?, ?, ?, ?);");
			pstmt.setString(1, room.getRoomtype());
			pstmt.setString(2, room.getFloor());
			pstmt.setInt(3, room.getMaxnumberofperson());
			pstmt.setInt(4, room.getCost());
			pstmt.setString(5, room.getTotalbeds());
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
