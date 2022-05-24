package com.AssignValues;

public class RoomDetails {
	private int Id;
	private String Floor;
	private String Roomtype;
	private String Availablityofrooms;
	private int Cost;
	private String Roomimage;
	public RoomDetails() {
		
	}
	
	public RoomDetails(int id,String floor, String roomtype, String availablityofrooms, int cost, String roomimage) {
		Id=id;
		Floor = floor;
		Roomtype = roomtype;
		Availablityofrooms = availablityofrooms;
		Cost = cost;
		Roomimage = roomimage;
//		System.out.println(Cost);
	}
	public RoomDetails(String floor, String roomtype, String availablityofrooms, int cost, String roomimage) {
		Floor = floor;
		Roomtype = roomtype;
		Availablityofrooms = availablityofrooms;
		Cost = cost;
		Roomimage = roomimage;
	}
	
	public int getId() {
		return Id;
	}
	public String getFloor() {
		return Floor;
	}
	public String getRoomtype() {
		return Roomtype;
	}
	public String getAvailablityofrooms() {
		return Availablityofrooms;
	}
	public int getCost() {
		return Cost;
	}
	public String getRoomimage() {
		return Roomimage;
	}
	
	
	public void setId(int id) {
		Id= id;
	}
	public void setFloor(String floor) {
		Floor = floor;
	}
	public void setRoomtype(String roomtype) {
		Roomtype = roomtype;
	}
	public void setAvailablityofrooms(String availablityofrooms) {
		Availablityofrooms = availablityofrooms;
	}
	public void setCost(int cost) {
		Cost = cost;
	}
	public void setRoomimage(String roomimage) {
		Roomimage = roomimage;
	}

}
