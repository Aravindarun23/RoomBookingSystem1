package com.Userfunction;

import java.sql.*;
import java.util.ArrayList;
import com.AssignValues.OrderDetails;
import com.validation.DBConnect;

public class UserSearch {
	private static Connection con = DBConnect.getcon();

	public static ArrayList<OrderDetails> UserSerachRoom(String Floor, int Cost, String Roomtype, String checkindate,String checkoutdate,int Persons,int Rooms) throws SQLException {
		ArrayList<OrderDetails> ListOfRooms = new ArrayList<OrderDetails>();
		PreparedStatement pstmt = con.prepareStatement("select * from \"RoomDetails\" where roomtype=? and  floor=? and price<=? and numberofpersons>=?;");
		pstmt.setString(1, Roomtype);
		pstmt.setString(2, Floor);
		pstmt.setInt(3, Cost);
		pstmt.setInt(4, Persons);
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			    OrderDetails order = new OrderDetails();
				int id = rs.getInt(5);
				PreparedStatement ps = con.prepareStatement("select * from \"BookingDetails\" where roomid=?");
				ps.setInt(1, id);
				ResultSet Rs = ps.executeQuery();
				boolean valid = true;
				while (Rs.next()) {
					int indate = DateAssign.splitDate(Rs.getString(2));
					int outdate = DateAssign.splitDate(Rs.getString(3));
					int Checkindate = DateAssign.splitDate(checkindate);
					int Checkoutdate = DateAssign.splitDate(checkoutdate);
					if (((Checkindate > outdate) && (Checkoutdate > outdate))
							|| ((Checkindate < indate) && (Checkoutdate < indate))) {
					} else {
						valid = false;
					
					}
				}
				if(valid) {
					
						int fromdate = DateAssign.splitDate(checkindate);
						int todate = DateAssign.splitDate(checkoutdate);
						int totaldays = todate - fromdate;
						order.setRoomtype(rs.getString(1));
						order.setFloor(rs.getString(2));
						order.setTotalpersons(rs.getInt(3));
						order.setPrice(rs.getInt(4));
						order.setRoomid(rs.getInt(5));
						order.setCheckindate(checkindate);
						order.setCheckoutdate(checkoutdate);
						order.setNumberofrooms(Rooms);
						order.setNumberofdays(totaldays);
						order.setTotalamount(rs.getInt(4)*totaldays*Rooms);
						
						ListOfRooms.add(order);
				}
						
			}
			return ListOfRooms;

		}
}
