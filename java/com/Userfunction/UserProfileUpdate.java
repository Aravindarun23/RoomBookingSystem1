package com.Userfunction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.validation.DBConnect;

public class UserProfileUpdate {
	private static Connection con=DBConnect.getcon();
	
	public static void profileUpdate(String usermail,String username,String mobileno,String address,String state,String pincode) throws SQLException {
		PreparedStatement pstmt = con.prepareStatement("UPDATE public.\"UserDetails\"\r\n"
				+ "	SET  name=?,  mobilenumber=?, address=?, state=?, pincode=?\r\n"
				+ "	WHERE email=?;");
		pstmt.setString(1,username );
		pstmt.setString(2, mobileno);
		pstmt.setString(3, address);
		pstmt.setString(4, state);
		pstmt.setString(5, pincode);
		pstmt.setString(6, usermail);
		pstmt.executeUpdate();
		
		
	}
	

}
