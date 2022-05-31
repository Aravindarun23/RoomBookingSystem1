<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.AssignValues.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
<title>Room Details</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Poppins', sans-serif;
}

body {
	height: 100vh;
	display: flex;
	background: #583759;
}

.pricedetails span {
	position: absolute;
	margin-left: 10px;
	margin-top: 40px;
}
.roomdetails span {
	position: relative;
	margin-left: 30px;
	
}

.roomdetails {
	position: relative;
	margin-top: 40px;
	margin-left: 80px;
	height: 400px;
	max-width: 500px;
	background: #f7efef;
	border-radius: 10px;
	box-shadow: 0 5px 10px black;
}

.pricedetails {
	position: relative;
	margin-top: 40px;
	margin-left: 90px;
	height: 400px;
	width: 300px;
	background: #f7efef;
	border-radius: 10px;
	box-shadow: 0 5px 10px black;
}

h1 {
	color: red;
	margin-top: 60px;
	margin-left: 20px;
}

button {
	position: relative;
	width: 90%;
	height: 60px;
	border: none;
	outline: unset;
	BAckground: black;
	color: white;
	border-radius: 10px;
	width: 120px;
	height: 40px;
	margin-top: 30px;
	margin-left: 60px;
}

img {
	position: relative;
	width: 500px;
	height: 250px;
	padding:30px;
}

a {
	color: white;
	text-decoration: none;
}
</style>
</head>
<body>
<% 

String  email=(String) session.getAttribute("usermail");
if(email==null){
	response.sendRedirect("Login.jsp");
	
}%>
	<%
	OrderDetails order=(OrderDetails)request.getSession().getAttribute("orderdetails");%>
	<div class="roomdetails">
		<img
			src="https://imageio.forbes.com/specials-images/imageserve/5cdb058a5218470008b0b00f/Nobu-Ryokan-Malibu/0x0.jpg?format=jpg&height=1009&width=2000">
		<span>Room Type :  <%=order.getRoomtype()%></span><br> <br>
		 <span>Floor :  <%=order.getFloor()%></span><br> <br> 
		 <span>Maximun number of persons :  <%=order.getTotalpersons()%></span><br> <br> 
		 <span>Price per day : <%=order.getPrice()%></span>
	</div>
	<div class="pricedetails">
		<span>Check-in-date: <%=order.getCheckindate()%></span><br> <br>
		<span>Check-out-date: <%=order.getCheckoutdate()%></span><br> <br>
		<span>Total Number Of Days: <%=order.getNumberofdays()%></span><br>
		<br> <span>TotalRooms: <%=order.getNumberofrooms()%> * <%=order.getPrice()%></span><br>
		<br> <span>TotalDays: <%=order.getNumberofdays()%> * <%=order.getPrice()%></span><br>
		<br> <span>Total Price : $ <%=order.getTotalamount()%></span><br>
		<h1>
			<i class="uil uil-rupee-sign"></i>
			<%=order.getTotalamount()%></h1>
		<button>
		
			<a href="UserOrderConfirmServlet">Book</a>
		</button>
	</div>
</body>
</html>