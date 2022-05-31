<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.Userfunction.UserSearch"%>
<%@ page import="com.validation.DBConnect"%>
<%@ page import="java.util.*"%>
<%@ page import="com.AssignValues.OrderDetails"%>
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
.Error{
color:red;}
.book{
margin-left:70px;}
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
.main{
    display:flex;
	float:left;
	margin-top:30px;
	Width:100%;
}
.cart{
margin-left:20px;
	position:relative;
	width:225px;
	height:300px;
	box-shadow:0 5px 10px black;
	Background:#7F525D;
}

.cart img{
	width:225px;
	display:inline-block;
	height:184px;
	padding:7px;
	
}
h1{
	align-items:center;
	font-size:14px;
	padding-top:2px;
	margin-left:10px;
	color:white;
}
button{
	position:relative;
	width:70%;
	height:40px;
	border:none;
	outline:unset;
	BAckground:black;
	color:white;
	border-radius:10px;
	width:90px;
	height:20px;
	margin-top:10px;
	margin-left:20px;

}
a{
color:white;
text-decoration:none;}
#Floor{
width:55px;}
#floor{
width:75px;
}

</style>
</head>
<body>
<% 

String  email=(String) session.getAttribute("usermail");
if(email==null){
	response.sendRedirect("Login.jsp");
	
}%>
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
	<div class="main" style="width: 100%;">
		<%
		
		ArrayList<OrderDetails> ListRooms = (ArrayList<OrderDetails>) request.getAttribute("roomobject");
		if (ListRooms.isEmpty()) {
		%>
		<h1 class="Error">No Results Found</h1>
		<%
		} else {
			for (OrderDetails list : ListRooms) {
		%>
		<div class="container">
			<div class="cart">
				<img
					src="https://www.mews.com/hubfs/Increasing%20revenue%20with%20day%20use%20rooms_Hero%20-%201245x1014.png">
					<form action="UserBookingServlet" method="post">
					<input type="hidden" name="roomtype" value="<%=list.getRoomtype()%>">
		<input type="hidden" name="floor" value="<%=list.getFloor()%>">
		<input type="hidden" name="person" value="<%=list.getTotalpersons()%>">
		<input type="hidden" name="price" value="<%=list.getPrice()%>">
		<input type="hidden" name="roomid" value="<%=list.getRoomid()%>">
		<input type="hidden" name="checkindate" value="<%=list.getCheckindate()%>">
		<input type="hidden" name="checkoutdate" value="<%=list.getCheckoutdate()%>">
		<input type="hidden" name="rooms" value="<%=list.getNumberofrooms()%>">
		<input type="hidden" name="totaldays" value="<%=list.getNumberofdays()%>">
		<input type="hidden" name="totalamount" value="<%=list.getTotalamount()%>">
					
					
				<h1>
					Room Type :<%=list.getRoomtype()%></h1>
				<h1>
					Floor :<%=list.getFloor()%></h1>
					<h1>
					Max number of person:<%=list.getTotalpersons()%></h1>
	
				<h1>
					Price :$<%=list.getPrice()%></h1>
					
				<button class="book" type="submit" >Book</button>
				</form>
				
			</div>
		</div>
		<% 
		}
		}
		%>
	</div>
	<button>
		<i class="uil uil-arrow-left"></i><a style="text-decoration: none; color: white" href="Welcome.jsp">Back</a>
	</button>
</body>
</body>
</html>