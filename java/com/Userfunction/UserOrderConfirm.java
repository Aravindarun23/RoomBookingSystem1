package com.Userfunction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.AssignValues.OrderDetails;
import com.validation.DBConnect;

public class UserOrderConfirm {
	private static Connection con = DBConnect.getcon();
	private static  String name;
	private static String mobilenumber;
	private static String email;
	private static String roomtype;

	public static void setName(String usermail) throws SQLException {
		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM public.\"UserDetails\" where email=?;");
		pstmt.setString(1, usermail);
		ResultSet rs=pstmt.executeQuery();
		rs.next();
		name=rs.getString(2);
		mobilenumber=rs.getString(5);
		email=rs.getString(3);
		
		
	}
	public static void setOrder(OrderDetails order) throws SQLException {
		roomtype=order.getRoomtype();
		
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO public.\"BookingDetails\"(\r\n"
				+ "	useremail, username, mobilenunmber, roomtype,checkindate,checkoutdate,totalprice,orderstatus,roomid)\r\n"
				+ "	VALUES (?, ?, ?, ?, ?, ? ,?,?,?);");
		pstmt.setString(1, email);
		pstmt.setString(2, name);
		pstmt.setString(3, mobilenumber);
		pstmt.setString(4, roomtype);
		pstmt.setString(5, order.getCheckindate());
		pstmt.setString(6, order.getCheckoutdate());
		pstmt.setInt(7, order.getTotalamount());
		pstmt.setString(8, "BOOKED");
		pstmt.setInt(9, order.getRoomid());
		pstmt.executeUpdate();
		
		
		
		
	
}
			
	}
