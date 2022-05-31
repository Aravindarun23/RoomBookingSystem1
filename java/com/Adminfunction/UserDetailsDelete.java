package com.Adminfunction;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.validation.DBConnect;

public class UserDetailsDelete {
	private static Connection con=DBConnect.getcon();

	public static void DeleteUser(int id) {
		try {
			PreparedStatement pstmt = con
					.prepareStatement("DELETE FROM public.\"UserDetails\"\r\n" + "	WHERE \"id\"=?;");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
