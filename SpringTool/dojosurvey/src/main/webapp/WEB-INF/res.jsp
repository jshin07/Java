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
	<h1> Submitted Info</h1>

	<h3> Name: <c:out value= "${name}"/><br>
		 Dojo Location: <c:out value= "${location}"/><br>
		 Favorite Language: <c:out value= "${lang}"/><br>
		 Comment: <c:out value= "${comment}"/><br>
	</h3><br>
	<form action="/back">
	<input type="submit" name="back" value="Go back">
	</form>
</body>
</html>