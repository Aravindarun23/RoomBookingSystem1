<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.Userfunction.*"%>
<%@ page import="com.validation.*"%>
<%@ page import="com.AssignValues.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="UserViewRooms.css">
<meta charset="ISO-8859-1">
<title>AdminViewRooms</title>
</head>
<body>
	<div class="main">
		<%
		ViewRoomDetails View = new ViewRoomDetails(DBConnect.getcon());
		List<RoomDetails> ListOfRooms = View.getAllrooms();
		for (RoomDetails room : ListOfRooms) {
		%>
		<div class="container">
			<div class="cart">
				<img
					src="https://www.mews.com/hubfs/Increasing%20revenue%20with%20day%20use%20rooms_Hero%20-%201245x1014.png">
				<h1>Room Type:<%=room.getRoomtype()%></h1>
				<h1>price : $<%=room.getCost() %></h1>
				<div>
				<button><a style="text-decoration:none;color:white"  href="AdminEditRoom.jsp?id=<%=room.getId()%>">Edit</a></button>
				<button><a style="text-decoration:none;color:white" href="AdminDeleteRoomServlet?id=<%=room.getId()%>">Delete</a></button>
				</div>
				</div>
		</div>
		<%
		}
		%>
	</div>
	<button><i class="uil uil-arrow-left"></i><a style="text-decoration:none;color:white"  href="AdminPage.jsp">Back</a></button>
</body>
</html>