<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.Userfunction.*" %>
    <%@ page import="com.AssignValues.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
<title>Profile Update</title>

<style>
@charset "ISO-8859-1";
@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700&display=swap');
*{
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family:'Poppins', sans-serif;
}
body{
	display:flex;
	align-items:center;
	justify-content:center;
	background-color:#f7efef;
}
.container{
    top:10px;
	position:relative;
	background:white;
	max-width: 350px;
	width:100%;
	border-radius:10px;
	box-shadow: 0 5px 10px black; 
	height:450px;
}
.container .form{
	padding:30px;
}
.container .form .title{
	position:relative;
	font-size:27px;
	font-weight:600;	
}
.form .input-area{
	position:relative; 
	height:28px;
	width:100%;
	margin-top:30px;
}
.input-area input{
	position:absolute;
	height:100%;
	width:100%;
	padding:0 50px;
	border:none;
	outline:none;
	font-size:12px;
	border-bottom:2px solid #ccc;
}
.input-area i{
	position:relative;
	font-size:23px;
	bottom:4px;
}
.form .button{
	margin-top:10px;
	
}
.form .button input{
	border :none;
	background-color:#4095f4;
	width:100%;
	height:40px;
	letter-spacing:1px;
	font-size:16px;
	color:#fff;
	border-radius:6px;	
}
.form .login-signup{
	
	text-align:center;
}
.form .login-signup a{
	text-decoration:none;
	color:Red;
}</style>
</head>
<body>
<% 

String  email=(String) session.getAttribute("usermail");
if(email==null){
	response.sendRedirect("Login.jsp");
	
}%>
<% String  mail= (String)request.getSession().getAttribute("usermail");
UserDetails profile=UserProfileEdit.editUserProfile(mail);
%>
	<div class="container">
		<div class="form">
			<span class="title">Profile Update</span>
			<form method="post" action="UserProfileEditServlet">
			<div class="input-area">
					<input type="text" placeholder="Enter Your Name" autocomplete="off"name="username" value="<%=profile.getUsername() %>"required>
					 <i class="uil uil-user"></i>
				</div>
				<div class="input-area">
					<input type="text" placeholder="Mobile Number" autocomplete="off" name="usermobile" value="<%=profile.getMobilenumber() %>" required>
					 <i class="uil uil-phone-volume"></i>
				</div>
				<div class="input-area">
					<input type="text" placeholder="Enter Your Address" autocomplete="off"name="useraddress" value="<%=profile.getAddress()%>" required>
					 <i class="uil uil-envelope"></i>
				</div>
				<div class="input-area">
					<input type="text" placeholder="Enter Your State" autocomplete="off" name="userstate" value="<%=profile.getState() %>" required>
					 <i class="uil uil-lock"></i>
				</div>
				<div class="input-area">
					<input type="text" placeholder="Enter your pincode" autocomplete="off" name="userpincode" value="<%=profile.getPincode() %>"required>
					 <i class="uil uil-phone-volume"></i>
				</div>
				
				<div class="button">
					<input type="Submit" value="Update">
				</div>
				<div class="login-signup">
				<span>
				
				<a href="Welcome.jsp" class=signup-text>
				<i class="uil uil-arrow-left"></i>Back</a>
				</span>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
