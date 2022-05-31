package com.Adminfunction;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.validation.DBConnect;

public class AdminDeleteRoom {
	private static Connection con=DBConnect.getcon();

	public static int DeleteRoom(int id) {
		try {
			PreparedStatement pstmt = con
					.prepareStatement("DELETE FROM public.\"RoomDetails\"\r\n" + "	WHERE \"id\"=?;");
			pstmt.setInt(1, id);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
