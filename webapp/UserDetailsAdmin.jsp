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
left:10%;
top:15%;
width:80%;

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
padding:10px 15px;
}
button{
	width:70%;
	height:40px;
	border:none;
	outline:unset;
	BAckground:red;
	border-radius:10px;
	width:90px;
	height:20px;
	margin-top:10px;
	margin-left:20px;
	position:absolute;
left:75%;
top:6%;
	

}
.link{
color:white;
text-decoration:none;

}
.back{
text-decoration:none;
position:absolute;
color:red;
left:10%;
top:10%;
}
</style>
</head>
<body>
<% 

String  email=(String) session.getAttribute("usermail");
if(email==null){
	response.sendRedirect("Login.jsp");
	
}%>
<% List<UserDetails> userlist=UserDetailsAdmin.getUserdetails();%>
<h2>Guest Details</h2><button><a class="link" href="AdminAddUser.jsp">Add Guest</a></button>
	<table>
	
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Mobile no</th>
			<th>Address</th>
			<th>State</th>
			<th>Pincode</th>
			<th></th>
			<th></th>
		</tr>
		<% for (UserDetails user : userlist) {
		%>
		
		<tr>
			<td><%=user.getUsername() %></td>
			<td><%=user.getUsermail() %></td>
			<td><%=user.getMobilenumber() %></td>
			<td><%=user.getAddress() %></td>
			<td><%=user.getState() %></td>
			<td><%=user.getPincode() %></td>
			<td><a href="AdminUserProfileUpdate.jsp?id=<%=user.getUserid()%>">Edit</a></td>
			<td><a href="UserDetailsDeleteServlet?userid=<%=user.getUserid()%>">Delete</a></td>
		</tr>
		<%
	}%>
	</table>
	<a class="back" href="AdminPage.jsp">Back</a>
</body>
</html>