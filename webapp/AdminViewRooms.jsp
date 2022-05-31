<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.Userfunction.*"%>
<%@ page import="com.validation.*"%>
<%@ page import="com.AssignValues.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="#">
<meta charset="ISO-8859-1">
<title>AdminViewRooms</title>
<style>
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

}
</style>
</head>
<body>
<% 

String  email=(String) session.getAttribute("usermail");
if(email==null){
	response.sendRedirect("Login.jsp");
	
}%>
	<div class="main">
		<%
		List<RoomDetails> ListOfRooms = ViewRoomDetails.getAllrooms();
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