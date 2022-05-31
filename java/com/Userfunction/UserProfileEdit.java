package com.Userfunction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.AssignValues.UserDetails;
import com.validation.DBConnect;

public class UserProfileEdit {
	private static Connection con=DBConnect.getcon();
	
	
	public  static UserDetails editUserProfile(String email) throws SQLException {
		UserDetails profile=new UserDetails();
		PreparedStatement pstmt= con.prepareStatement("SELECT *\r\n"
				+ "	FROM public.\"UserDetails\" where email=?;");
		pstmt.setString(1, email);
		ResultSet rs=pstmt.executeQuery();
		rs.next();
		profile.setUsername(rs.getString(2));
		profile.setMobilenumber(rs.getString(5));
		profile.setAddress(rs.getString(6));
		profile.setState(rs.getString(7));
		profile.setPincode(rs.getString(8));
		
		
		return profile;
		
	}

}
