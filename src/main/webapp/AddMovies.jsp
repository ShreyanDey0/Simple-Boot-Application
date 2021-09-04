<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="./style/home.css">
<title>Add-Movies</title>
</head>
<body>
	<div class="form">
		<form action="submitMovies">
			
			<input type= "text" name="mname" placeholder="Movie name.."><br>
			<input type ="text" name="lactor" placeholder="lead actor.."><br>
			<input type= "text" name="lactress" placeholder="lead actress.."><br>
			<input type ="text" name="director" placeholder="Director.."><br>
			<input type ="text" name="year" placeholder="Release year.."><br>
			<div style="display:flex; justify-content: center;" ><input style="padding: 5px; font-size:15px;" type="submit"></div>
		</form>	
	</div>
	<br>
	<hr>
</body>
</html>