package com.AssignValues;

public class OrderDetails {
	private int Orderid;
	private String Floor;
	private String Usermail;
	private String Username;
	private int roomid;
	private int numberofrooms;
	private int totalpersons;
	private int price;
	private int Totalamount;
	private int numberofdays;
	private String Usermobileno;
	private String Roomtype;
	private String Checkindate;
	private String Checkoutdate;
	private String Totalprice;
	private String Orderstatus;
	public OrderDetails() {
		super();
	}
	public OrderDetails(int id, String mail, String name,String mobileno,String type,String indate,String outdate,String price,String status) {
		Orderid=id;
		Usermail=mail;
		Username=name;
		Usermobileno=mobileno;
		Roomtype=type;
		Checkindate=indate;
		Checkoutdate=outdate;
		Totalprice=price;
		Orderstatus=status;	
		
	}
	
	public int getOrderid() {
		return Orderid;
	}
	public void setOrderid(int orderid) {
		Orderid = orderid;
	}
	public String getUsermail() {
		return Usermail;
	}
	public void setUsermail(String usermail) {
		Usermail = usermail;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getUsermobileno() {
		return Usermobileno;
	}
	public void setUsermobileno(String usermobileno) {
		Usermobileno = usermobileno;
	}
	public String getRoomtype() {
		return Roomtype;
	}
	public void setRoomtype(String roomtype) {
		Roomtype = roomtype;
	}
	public String getCheckindate() {
		return Checkindate;
	}
	public void setCheckindate(String checkindate) {
		Checkindate = checkindate;
	}
	public String getCheckoutdate() {
		return Checkoutdate;
	}
	public void setCheckoutdate(String checkoutdate) {
		Checkoutdate = checkoutdate;
	}
	public String getTotalprice() {
		return Totalprice;
	}
	public void setTotalprice(String totalprice) {
		Totalprice = totalprice;
	}
	public String getOrderstatus() {
		return Orderstatus;
	}
	public void setOrderstatus(String orderstatus) {
		Orderstatus = orderstatus;
	}
	public int getRoomid() {
		return roomid;
	}

	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}

	public int getNumberofrooms() {
		return numberofrooms;
	}

	public void setNumberofrooms(int numberofrooms) {
		this.numberofrooms = numberofrooms;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumberofdays() {
		return numberofdays;
	}

	public void setNumberofdays(int numberofdays) {
		this.numberofdays = numberofdays;
	}
	public String getFloor() {
		return Floor;
	}
	public void setFloor(String floor) {
		Floor = floor;
	}
	public int getTotalpersons() {
		return totalpersons;
	}
	public void setTotalpersons(int totalpersons) {
		this.totalpersons = totalpersons;
	}
	public int getTotalamount() {
		return Totalamount;
	}
	public void setTotalamount(int totalamount) {
		Totalamount = totalamount;
	}

	
	



}
