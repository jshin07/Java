<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Random Word</title>
</head>
<body>

	
	<form action="/RandomWord/index" method="get">
		<h2>You have generated a word ${count} times</h2>
		<h2>${uuid}</h2>
		<input type="submit" name="submit" value= "Generate">
	</form>
	

	
	<h2>The last time you generated a word was: </h2>
	<h2>${time}</h2>
</body>
</html>