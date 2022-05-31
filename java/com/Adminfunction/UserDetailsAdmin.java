package com.Adminfunction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.AssignValues.UserDetails;
import com.validation.DBConnect;


public class UserDetailsAdmin {
	private static Connection con = DBConnect.getcon();

	public static List<UserDetails> getUserdetails() throws SQLException {
		List<UserDetails> Listofusers = new ArrayList<UserDetails>();
		UserDetails user = null;
		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM public.\"UserDetails\";");
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			user = new UserDetails(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
					rs.getString(6), rs.getString(7), rs.getString(8));
			Listofusers.add(user);

		}
		return Listofusers;

	}
}
