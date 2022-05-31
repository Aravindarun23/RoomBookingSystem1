<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="#">
<title>AddRoom</title>
</head>
<style>
@charset "ISO-8859-1";

@import
	url('https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700&display=swap')
	;

* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Poppins', sans-serif;
}

body {
	height: 100%;
	display: flex;
	align-items: center;
	justify-content: center;
	background-color: #f7efef;
}

.container {
	position: relative;
	background: white;
	max-width: 350px;
	height: 450px;
	width: 100%;
	border-radius: 10px;
	box-shadow: 0 5px 10px black;
	margin-top: 20px;
}

.container .form {
	padding-left: 20px;
	padding-right: 20px;
}

.container .form .title {
	position: relative;
	font-size: 27px;
	font-weight: 600;
}

.form .input-area {
	position: relative;
	height: 30px;
	width: 100%;
	margin-top: 30px;
}

.input-area input {
	position: relative;
	height: 100%;
	width: 50%;
	padding: 0 20px;
	border: 1px solid black;
	outline: none;
	font-size: 12px;
	left: 30px;
}

.input-area i {
	position: relative;
	font-size: 23px;
	bottom: 5px;
}

.form .button {
	margin-top: 25px;
}

.form .button input {
	border: none;
	background-color: black;
	width: 100%;
	height: 40px;
	letter-spacing: 1px;
	font-size: 16px;
	color: #fff;
	border-radius: 6px;
}

.form .login-signup {
	margin-top: 6px;
	text-align: center;
}

.form .login-signup a {
	text-decoration: none;
	color: Red;
}
</style>
<body>
<% 

String  email=(String) session.getAttribute("usermail");
if(email==null){
	response.sendRedirect("Login.jsp");
	
}%>
	<div class="container">
		<div class="form">
			<span class="title">Add Room</span>
			<form method="post" action="AdminAddRoomServlet">
				
				<div class="input-area">
					<span>Room Type : </span><input type="text" placeholder="Room Type"
						name="roomtype">
				</div>
				<div class="input-area">
					<span>Floor : </span><input type="text" placeholder="Floor"
						name="floor">
				</div>
				<div class="input-area">
					<span>Max number<br> of person : </span><input type="text"
						placeholder="numberofpersons" name="numberofpersons">
				</div>
				<div class="input-area">
					<span>Price : </span><input type="number" placeholder="price"
						name="cost">
				</div>
				
				<div class="input-area">
					<span>Total Beds : </span><input type="text"
						placeholder="number of beds" name="totalbeds">
				</div>
				<div class="button">
					<input type="Submit" value="Add Now">
				</div>
				<div class="login-signup">
					<a href="AdminPage.jsp" class=signup-text>
					<i class="uil uil-arrow-left"></i>Back</a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>