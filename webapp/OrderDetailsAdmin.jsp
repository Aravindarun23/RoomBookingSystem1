<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.Adminfunction.*"%> 
<%@ page import="com.AssignValues.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
@charset "ISO-8859-1";

*{
	margin: 0;
	padding: 0;
	outline:0;
}
body{
background:#f7efef;
}
h2{
position:absolute;
left:40%;
top:6%;
color:black;}
table{
position:absolute;
left:5%;
top:15%;
width:30%;
text-align:center;
background:white;
border-spacing:0;
border-radius:15px 15px 0  0;
overflow:hidden;

}
th{
background:#583759;
color:white;
}
th,td{
padding:5px 10px;
}
a{
text-decoration:none;
color:red;
}
.back{
text-decoration:none;
position:absolute;
color:red;
left:80%;
top:8%;
}

</style>
</head>
<body>
<% 

String  email=(String) session.getAttribute("usermail");
if(email==null){
	response.sendRedirect("Login.jsp");
	
}%>
<% List<OrderDetails> orderlist=UserOrderDetailsAdmin.getUserbookings();%>
<h2>Booking Details</h2>
<a class="back" href="AdminPage.jsp">Back</a>
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
	<% for (OrderDetails order : orderlist) {
		String Status = order.getOrderstatus();
		%>
		
		<tr>
			<td><%=order.getOrderid() %></td>
			<td><%=order.getUsermail() %></td>
			<td><%=order.getUsername() %></td>
			<td><%=order.getUsermobileno() %></td>
			<td><%=order.getRoomtype() %></td>
			<td><%=order.getCheckindate() %></td>
			<td><%=order.getCheckoutdate() %></td>
			<td><%=order.getTotalprice() %></td>
			<td><%=order.getOrderstatus() %></td>
			<td><%
				if ("BOOKED".equals(Status)) {
				%><a
					href="AdminUserOrderCancelServlet?id=<%=order.getOrderid()%>">Cancel</a>
				<%
				} else if("CHECK_IN".equals(Status)) {
				%><a href="AdminUserOrderCancelServlet?id=<%=order.getOrderid()%>">Checkout</a>
				<%
				}
				%></td>
		</tr>
		<%
	}%>
	</table>
</body>
</html>