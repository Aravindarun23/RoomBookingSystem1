package com.validation;
import java.sql.*;

public class DBConnect {
	private static Connection con;

	public static Connection getcon() {
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/RoomBookingSystem", "postgres", "root");
		} catch (Exception e) {
			e.printStackTrace();

		}
		return con;

	}
	
	public static int login(String usermail, String userpass) throws SQLException {
		try {
			Connection con = getcon();
			PreparedStatement pstmt = con.prepareStatement("SELECT * from \"UserDetails\" where email=? and password=?;");
			pstmt.setString(1, usermail);
			pstmt.setString(2, userpass);
			ResultSet rs= pstmt.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
			
		}
		catch(Exception e) {
			return 0;
		}
		return 0;

	}
	public static boolean adminlogin(String adminmail, String adminpass) throws SQLException {
		try {
			Connection con = getcon();
			PreparedStatement pstmt = con.prepareStatement("SELECT * from \"Admin_Details\" where admin_username=? and admin_password=?;");
			pstmt.setString(1, adminmail);
			pstmt.setString(2, adminpass);
			ResultSet rs= pstmt.executeQuery();
			if(rs.next()) {
				return true;
			}
			
		}
		catch(Exception e) {
			return false;
		}
		return false;

	}
	public static int Signup(String username,String useremail,String userpass,String usermobile,String useraddress,String userstate,String userpincode) throws SQLException  {
		int value=0;
		
			Connection con = getcon();
			PreparedStatement pstmt =con.prepareStatement("INSERT INTO public.\"UserDetails\"(\r\n"
					+ "name, email, password, mobilenumber, address, state, pincode)\r\n"
					+ "	VALUES ( ?, ?, ?, ?, ?, ?, ?);");
			pstmt.setString(1,username);
			pstmt.setString(2,useremail);
			pstmt.setString(3,userpass);
			pstmt.setString(4,usermobile);
			pstmt.setString(5,useraddress);
			pstmt.setString(6,userstate);
			pstmt.setString(7,userpincode);
			int v=pstmt.executeUpdate();
			System.out.println(con);
			if(v>0) {
				value=1;
		 
			return value;
			
		}
			return value;
		
		 
		
	}
}