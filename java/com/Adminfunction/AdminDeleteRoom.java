package com.Adminfunction;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AdminDeleteRoom {
	private static Connection con;

	public AdminDeleteRoom(Connection con) {
		super();
		this.con = con;
	}

	public static int DeleteRoom(int id) {
		try {
			PreparedStatement pstmt = con
					.prepareStatement("DELETE FROM public.\"RoomDetails\"\r\n" + "	WHERE \"Id\"=?;");
			pstmt.setInt(1, id);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
