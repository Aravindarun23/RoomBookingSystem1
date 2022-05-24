<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
<link rel="stylesheet" href="#">
<meta charset="ISO-8859-1">
<title>AdminPage</title>
<style>@charset "ISO-8859-1";
@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700&display=swap');
*{
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family:'Poppins', sans-serif;
}
.header{
	width:100%;
	height:100vh;
	background:#f7efef;
}
nav{
	width:100%;
	display:flex;
	align-items:center;
	
}
nav h1{
	color:red;
	font-size:30px;
	padding-left:23px;
}
nav span{
	font-size:15px;
	padding-top:7px;
}
nav ul{
	padding-left:10%; 
	margin-left:19%;
	font-size:15px;
}
nav ul li{
	display:inline-block;
	list-style:none;
	margin: 10px 30px;
}
nav ul li a{
	text-decoration:none;
	color:black;
}
.text{
	margin-top:50px;
	max-width:500px;
	padding-left:30px;
}
.text{
	font-size:32px;
}
.image{
	position:absolute;
	top:0;
	left:780px;
}
.image img{
	width:640px;
	padding-top:170px;
	
}</style>
</head>

<body>
	<div class="header">
		<nav>
			<h1>B</h1>
			<span>ook.in</span>
			<ul>
				<li><a href="AdminViewRooms.jsp">AllRooms</a></li>
				<li><a href="AddRoom.jsp">AddRooms</a></li>
				<li><a href="#">Orders</a></li>
				<li><a href="#">Contact</a></li>
				<li><a href="#">Logout</a></li>
			</ul>
		</nav>
		<div class="text">
			<h1>Great Discount On Weekends</h1>
			<p>Book Your Rooms Now !!</p>
		</div>
		
	</div>
</body>
</html>