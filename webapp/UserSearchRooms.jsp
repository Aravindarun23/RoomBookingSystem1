<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.Userfunction.UserSearch"%>
<%@ page import="com.validation.DBConnect"%>
<%@ page import="java.util.*"%>
<%@ page import="com.AssignValues.RoomDetails"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
<link rel="stylesheet" href="UserSerach.css">
<meta charset="ISO-8859-1">
<title>SearchPage</title>
</head>
<body>
	<div class="header">
		<form method="post" action="UserSearchRooms.jsp">
			<div class="input-area">
				<div class="input">
					<span>Check-in-date</span> <input type="date"
						placeholder="arrivaldate" name="check-in-date" required> <span>Check-out-date</span>
					<input type="date" placeholder="depaturedate" name="check-out-date"
						required> <input type="text" placeholder="Rooomtype"
						name="roomtype" required> <input type="number"
						placeholder="Floor Number" name="floor" required> <input
						type="number" placeholder="Price Range" name="cost" required>
					<input type="submit" class="button" value="search">
				</div>
			</div>
		</form>
	</div>
	<div class="main" style="width:100%;">
		<%
		String Floor = request.getParameter("floor");
		String Roomtype = request.getParameter("roomtype");
		String Cost = request.getParameter("cost");
		UserSearch search = new UserSearch(DBConnect.getcon());
		List<RoomDetails> ListRooms = search.UserSerachRoom(Floor, Cost, Roomtype);
		if (ListRooms.isEmpty()) {
		%>
		<h1 class="Error">No Results Found</h1>
		<%
		} else {
		for (RoomDetails list : ListRooms) {
		%>
		<div class="container">
			<div class="cart">
				<img
					src="https://www.mews.com/hubfs/Increasing%20revenue%20with%20day%20use%20rooms_Hero%20-%201245x1014.png">
				<h1>
					Room Type :<%=list.getRoomtype()%></h1>
				<h1>
					Price :$<%=list.getCost()%></h1>
				<button>Add to cart</button>
				<button>View</button>
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