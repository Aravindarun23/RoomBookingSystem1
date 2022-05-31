package com.Adminfunction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.AssignValues.UserDetails;
import com.validation.DBConnect;

public class UserDetailsEdit {
private static Connection con=DBConnect.getcon();
	
	
	public  static UserDetails editUserdetails(int id) throws SQLException {
		UserDetails profile=new UserDetails();
		PreparedStatement pstmt= con.prepareStatement("SELECT *\r\n"
				+ "	FROM public.\"UserDetails\" where id=?;");
		pstmt.setInt(1, id);
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
