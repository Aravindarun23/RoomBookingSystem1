package com.AssignValues;

public class RoomDetails {
	private int Id;
	private String Floor;
	private String Roomtype;
	private int Maxnumberofperson;
	private int Cost;
	private String Totalbeds;

	public RoomDetails() {
		super();

	}

	public RoomDetails(int id, String roomtype, String floor,int maxnumofpersons, int cost,String totalbeds){
		Id = id;
		Roomtype = roomtype;
		Floor = floor;
		Maxnumberofperson = maxnumofpersons;
		Cost = cost;
		Totalbeds=totalbeds;
		
		
		
		
	}

	public RoomDetails(String roomtype, String floor, int maxnumofpersons, int cost,String totalbeds) {
		Roomtype = roomtype;
		Floor = floor;
		Maxnumberofperson = maxnumofpersons;
		Cost = cost;
		Totalbeds= totalbeds;
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getRoomtype() {
		return Roomtype;
	}

	public void setRoomtype(String roomtype) {
		Roomtype = roomtype;
	}


	public int getMaxnumberofperson() {
		return Maxnumberofperson;
	}

	public void setMaxnumberofperson(int maxnumberofperson) {
		Maxnumberofperson = maxnumberofperson;
	}

	public String getFloor() {
		return Floor;
	}

	public void setFloor(String floor) {
		Floor = floor;
	}

	public int getCost() {
		return Cost;
	}

	public void setCost(int cost) {
		Cost = cost;
	}

	public String getTotalbeds() {
		return Totalbeds;
	}

	public void setTotalbeds(String totalbeds) {
		this.Totalbeds = totalbeds;
	}
}
