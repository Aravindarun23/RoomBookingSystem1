package com.AssignValues;

public class UserDetails {
	private int Userid;
	private String Username;
	private String Usermail;
	private String Userpassword;
	private String Mobilenumber;
	private String Address;
	private String State;
	private String Pincode;
	public UserDetails() {
		super();
	}
	
	
	
	public UserDetails(int id,String name, String mail,String password,String mobileno,String address,String state,String pincode) {
		Userid=id;
		Username=name;
		Usermail=mail;
		Userpassword=password;
		Mobilenumber=mobileno;
		Address=address;
		State=state;
		Pincode=pincode;
	
		
	}
	public int getUserid() {
		return Userid;
	}
	public void setUserid(int userid) {
		Userid = userid;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getUsermail() {
		return Usermail;
	}
	public void setUsermail(String usermail) {
		Usermail = usermail;
	}
	public String getUserpassword() {
		return Userpassword;
	}
	public void setUserpassword(String userpassword) {
		Userpassword = userpassword;
	}
	public String getMobilenumber() {
		return Mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		Mobilenumber = mobilenumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
	

}
