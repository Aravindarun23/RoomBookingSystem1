<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.Userfunction.*"%>
<%@ page import="com.AssignValues.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
@charset "ISO-8859-1";

* {
	margin: 0;
	padding: 0;
	outline: 0;
}

body {
	background: #f7efef;
}

h2 {
	position: absolute;
	left: 40%;
	top: 6%;
	color: black;
}

table {
	position: absolute;
	left: 5%;
	top: 15%;
	width: 30%;
	text-align: center;
	background: white;
	border-spacing: 0;
	border-radius: 15px 15px 0 0;
	overflow: hidden;
}

th {
	background: #583759;
	color: white;
}

th, td {
	padding: 5px 10px;
}

a {
	font-size: 15px;
	color: red;
	text-decoration: none;
}
button{
	position:absolute;
	width:70%;
	height:40px;
	border:none;
	outline:unset;
	BAckground:red;
	color:white;
	border-radius:10px;
	width:90px;
	height:20px;
	margin-top:10px;
	margin-left:20px;
	left:5%;
    top:6%;

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
	String usermail = (String) session.getAttribute("usermail");
	List<OrderDetails> orderlist = UserOrderDetails.getUserbookings(usermail);
	%>
	<button><a style="text-decoration:none;color:white"  href="Welcome.jsp">Back</a></button>
	<h2>Booking Details</h2>
	<table>
		<tr>
			<th>Order id</th>
			<th>Email</th>
			<th>Name</th>
			<th>Mobile No</th>
			<th>Room Type</th>
			<th>CheckInDate</th>
			<th>CheckOuDate</th>
			<th>Price</th>
			<th>Status</th>
			<th></th>
			<th></th>
		</tr>
		<%
		for (OrderDetails order : orderlist) {
			String Status = order.getOrderstatus();
		%>
		<tr>
			<td><%=order.getOrderid()%></td>
			<td><%=order.getUsermail()%></td>
			<td><%=order.getUsername()%></td>
			<td><%=order.getUsermobileno()%></td>
			<td><%=order.getRoomtype()%></td>
			<td><%=order.getCheckindate()%></td>
			<td><%=order.getCheckoutdate()%></td>
			<td><%=order.getTotalprice()%></td>
			<td><%=order.getOrderstatus()%></td>
			<td>
				<%
				if ("BOOKED".equals(Status)) {
				%><a
					href="UserOrderCancelServlet?id=<%=order.getOrderid()%>">Cancel</a>
				<%
				} else if("CHECK_IN".equals(Status)) {
				%><a href="UserOrderCancelServlet?id=<%=order.getOrderid()%>">Checkout</a>
				<%
				}
				%>
			</td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>