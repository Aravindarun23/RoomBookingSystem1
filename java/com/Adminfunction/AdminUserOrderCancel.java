package com.Adminfunction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.validation.DBConnect;

public class AdminUserOrderCancel {
private static Connection con=DBConnect.getcon();
	
	public static void orderCancel(int id) throws SQLException {
		PreparedStatement pstmt=con.prepareStatement("SELECT * FROM public.\"BookingDetails\" where orderid=?;");
		pstmt.setInt(1, id);
		ResultSet rs=pstmt.executeQuery();
		rs.next();
		String status=rs.getString(9);
		
		
		
		PreparedStatement pst=con.prepareStatement("UPDATE public.\"BookingDetails\"\r\n"
				+ "	SET  orderstatus=?\r\n"
				+ "	WHERE orderid=?;");
		if("BOOKED".equals(status)) {
			pst.setString(1,"CANCELLED");
			pst.setInt(2, id);
			pst.executeUpdate();
			
		}
		else {
			pst.setString(1,"CHECKOUT");
			pst.setInt(2, id);
			pst.executeUpdate();
			
		}
		
		
		
	}

}
