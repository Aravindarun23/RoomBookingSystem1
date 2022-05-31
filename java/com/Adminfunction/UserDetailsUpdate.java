package com.Adminfunction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.validation.DBConnect;

public class UserDetailsUpdate {
		private static Connection con=DBConnect.getcon();
		
		public static void detailsUpdate(int id,String username,String mobileno,String address,String state,String pincode) throws SQLException {
			PreparedStatement pstmt = con.prepareStatement("UPDATE public.\"UserDetails\"\r\n"
					+ "	SET  name=?,  mobilenumber=?, address=?, state=?, pincode=?\r\n"
					+ "	WHERE id=?;");
			pstmt.setString(1,username );
			pstmt.setString(2, mobileno);
			pstmt.setString(3, address);
			pstmt.setString(4, state);
			pstmt.setString(5, pincode);
			pstmt.setInt(6, id);
			pstmt.executeUpdate();
			
			
		}
		

	

}
