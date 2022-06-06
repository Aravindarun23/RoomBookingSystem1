package com.Userfunction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.AssignValues.OrderDetails;
import com.validation.DBConnect;

public class UserOrderDetails {
	private static Connection con = DBConnect.getcon();
	

	public static List<OrderDetails> getUserbookings(int userid) throws SQLException {
		List<OrderDetails> Listoforders = new ArrayList<OrderDetails>();
		OrderDetails order = null;
		PreparedStatement pstmt = con.prepareStatement("select \"BookingDetails\".orderid,\"UserDetails\".name,\"UserDetails\".email,\"UserDetails\".mobilenumber,\"RoomDetails\".roomtype,\"BookingDetails\".checkindate,\"BookingDetails\".checkoutdate,\"BookingDetails\".totalprice,\"BookingDetails\".orderstatus from \"BookingDetails\" join \"UserDetails\" on \"BookingDetails\".userid=\"UserDetails\".id join \"RoomDetails\" on \"BookingDetails\".roomid=\"RoomDetails\".id where \"BookingDetails\".userid=?;");
		pstmt.setInt(1,userid);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			order = new OrderDetails(rs.getInt(1), rs.getString(3), rs.getString(2), rs.getString(4), rs.getString(5),
					rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
			Listoforders.add(order);

		}
		return Listoforders;

	}


	

}
