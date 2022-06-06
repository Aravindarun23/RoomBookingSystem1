package com.Userfunction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.AssignValues.OrderDetails;
import com.validation.DBConnect;

public class UserOrderConfirm {
	private static Connection con = DBConnect.getcon();
	private static int userid;

	public static void setName(String usermail) throws SQLException {
		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM public.\"UserDetails\" where email=?;");
		pstmt.setString(1, usermail);
		ResultSet rs=pstmt.executeQuery();
		rs.next();
		userid=rs.getInt(1);
		System.out.print(userid);
		
		
	}
	public static void setOrder(OrderDetails order) throws SQLException {
		
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO public.\"BookingDetails\"(\r\n"
				+ "checkindate,checkoutdate,totalprice,orderstatus,roomid,userid)\r\n"
				+ "	VALUES (?, ?, ?, ?, ?, ? );");
		pstmt.setString(1, order.getCheckindate());
		pstmt.setString(2, order.getCheckoutdate());
		pstmt.setInt(3, order.getTotalamount());
		pstmt.setString(4, "BOOKED");
		pstmt.setInt(5, order.getRoomid());
		pstmt.setInt(6, userid);
		
		pstmt.executeUpdate();
		
		
		
		
	
}
			
	}
