<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
<link rel="stylesheet" href="#">
<meta charset="ISO-8859-1">
<title>SearchPage</title>
<style type="text/css">
@charset "ISO-8859-1";
*{
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family:'Poppins', sans-serif;
}
body{
	width:100%;
	background:#f7efef;
	
}
.input-area{
	background:#583759;
	width:100%;
	height:80px;
	box-shadow: 0 3px 7px black; 
}
.input-area input{
	position:relative;
	margin-top:25px;
	border-radius:20px;
	margin-left:5px;
	width:110px;
	padding:5px;
	font-size:10px;
}
.input-area  span{
	margin-left:5px;
	font-size:10px;
	color:white;
	
}
.button{
	background:red;
	color:white;
}
#Floor{
width:55px;}
#floor{
width:75px;
}
</style>
</head>
<% 

String  email=(String) session.getAttribute("usermail");
if(email==null){
	response.sendRedirect("Login.jsp");
	
}%>
<body>
	<div class="header">
		<form method="post" action="UserSearchServlet">
			<div class="input-area">
				<div class="input">
					<span>Check-in-date</span> 
					<input type="date" placeholder="arrivaldate" name="checkindate" required> 
					<span>Check-out-date</span>
					<input type="date" placeholder="depaturedate" name="checkoutdate" required>
					<input id="floor"type="text" placeholder="Rooomtype" name="roomtype" required>
					<input id="Floor" type="number" placeholder="Floor" name="floor" required>
					<input type="number" placeholder="Number of person" name="persons" required>
					<input type="number" placeholder="Number of rooms" name="rooms" required>
					<input type="number" placeholder="Price Range" name="cost" required> 
					<input type="submit" class="button" value="search">
				</div>
			</div>
		</form>
	</div>
</body>
</html>