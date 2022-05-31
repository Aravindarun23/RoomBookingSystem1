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
		int value = 0;
		try {
			if (usermail.equals("Admin2302@gmail.com") && userpass.equals("24689")) {
				value = 2;
			} else {
				Connection con = getcon();
				PreparedStatement ps = con.prepareStatement("SELECT * from \"UserDetails\";");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					
					if (usermail.equals(rs.getString(3)) && userpass.equals(rs.getString(4)))
					{
						value=1;
						
					}
				}
			}
			return value;	
		}
		catch(Exception e) {
			return value;
		}
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