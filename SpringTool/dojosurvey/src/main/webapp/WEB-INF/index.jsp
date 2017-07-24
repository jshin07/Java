<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dojo Survey</title>
</head>
<body>
	<form action="/process" method="POST">
		Your Name: <input type="text" name="name"><br>
		Dojo Location: <select name="location">
  						<option value="San Jose">San Jose</option>
 						<option value="DC">Washington DC</option>
 						<option value="Seattle">Seattle</option>
 						</select><br>
 		Favorite Language: <select name="lang">
  						<option value="Python">Python</option>
 						<option value="Java">Java</option>
 						<option value="Ruby">Ruby</option>
 						</select><br>
 		Comment(optional): <textarea name="comment"></textarea><br>
 		<input type="submit" value="Submit">
	</form>
</body>
</html>


