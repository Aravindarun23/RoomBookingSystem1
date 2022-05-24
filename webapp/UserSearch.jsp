<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
					<span>Check-in-date</span> 
					<input type="date" placeholder="arrivaldate" name="check-in-date" required> 
					<span>Check-out-date</span>
					<input type="date" placeholder="depaturedate" name="check-out-date" required>
					<input type="text" placeholder="Rooomtype" name="roomtype" required>
					<input type="number" placeholder="Floor Number" name="floor" required> 
					<input type="number" placeholder="Price Range" name="cost" required> 
					<input type="submit" class="button" value="search">
				</div>
			</div>
		</form>
	</div>
</body>
</html>