<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="#">
<title>Signpage</title>
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
	display: flex;
	align-items: center;
	justify-content: center;
	background-color: #4099f4;
}

.container {
	position: relative;
	background: white;
	max-width: 350px;
	width: 100%;
	border-radius: 10px;
	box-shadow: 0 5px 10px black;
}

.container .form {
	padding: 30px;
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
	position: absolute;
	height: 100%;
	width: 100%;
	padding: 0 50px;
	border: none;
	outline: none;
	font-size: 12px;
	border-bottom: 2px solid #ccc;
}

.input-area i {
	position: relative;
	font-size: 23px;
	bottom: 4px;
}

.form .button {
	margin-top: 25px;
}

.form .button input {
	border: none;
	background-color: #4095f4;
	width: 100%;
	height: 40px;
	letter-spacing: 1px;
	font-size: 16px;
	color: #fff;
	border-radius: 6px;
}

.form .login-signup {
	margin-top: 30px;
	text-align: center;
}

.form .login-signup a {
	text-decoration: none;
	color: Red;
}
</style>
</head>
<body>
<% 

String  email=(String) session.getAttribute("usermail");
if(email==null){
	response.sendRedirect("Login.jsp");
	
}%>
	<div class="container">
		<div class="form">
			<span class="title">Add User</span>
			<form method="post" action="AdminAddUserServlet">
			<div class="input-area">
					<input type="text" placeholder="Enter Your Name" autocomplete="off"name="username" required>
					 <i class="uil uil-user"></i>
				</div>
				<div class="input-area">
					<input type="email" placeholder="Enter Your Email" autocomplete="off"name="useremail" required>
					 <i class="uil uil-envelope"></i>
				</div>
				<div class="input-area">
					<input type="password" placeholder="Enter Your Password" autocomplete="off" name="userpass" required>
					 <i class="uil uil-lock"></i>
				</div>
				<div class="input-area">
					<input type="text" placeholder="Mobile Number" autocomplete="off" name="usermobile" required>
					 <i class="uil uil-phone-volume"></i>
				</div>
				<div class="input-area">
					<input type="text" placeholder="Enter Your Address" autocomplete="off"name="useraddress" required>
					 <i class="uil uil-envelope"></i>
				</div>
				<div class="input-area">
					<input type="text" placeholder="Enter Your State" autocomplete="off" name="userstate" required>
					 <i class="uil uil-lock"></i>
				</div>
				<div class="input-area">
					<input type="text" placeholder="Enter your pincode" autocomplete="off" name="userpincode" required>
					 <i class="uil uil-phone-volume"></i>
				</div>
				
				
				<div class="button">
					<input type="Submit" value="Add Guest Now">
				</div>
				<div class="login-signup">
				<a href="UserDetailsAdmin.jsp" class=signup-text>Back</a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>