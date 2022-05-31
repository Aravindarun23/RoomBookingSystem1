package com.Userfunction;

import com.AssignValues.*;

public class UserBooking {
	public static OrderDetails placeOrder(String roomtype, String floor, int cost, int persons, int rooms,
			String checkindate, String checkoutdate, int totaldate, int totalamount, int roomid) {
		OrderDetails order=new OrderDetails();
		order.setRoomtype(roomtype);
		order.setFloor(floor);
		order.setPrice(cost);
		order.setTotalpersons(persons);
		order.setNumberofrooms(rooms);
		order.setCheckindate(checkindate);
		order.setCheckoutdate(checkoutdate);
		order.setNumberofdays(totaldate);
		order.setTotalamount(totalamount);
		order.setRoomid(roomid);
		return order;
		
	}

}
