<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>The Code</title>
</head>
<body>
	<br>
	<h2 style="color:red">${error}</h2>
	<h2> What is your code?</h2>
	<form action="/submit" method="post">
		<input type="text" name="code"><br>
		<input type="submit" name="Try Code">
	</form>
</body>
</html>