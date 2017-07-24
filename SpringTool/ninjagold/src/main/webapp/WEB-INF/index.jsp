<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style.css" rel="style/css">
<title>Ninja Gold</title>
</head>
<body>
	<h2>Your Gold: ${gold}</h2><br>
	
	<h3>Farm<br>(earns 10-20 golds)</h3><br>
	<form action="process/1" method="post">
		<input type="submit" name="farm" value="Find Gold">
	</form>
	<h3>Cave<br>(earns 5-10 golds)</h3><br>
	<form action="/process/2" method="post">
		<input type="submit" name="cave" value="Find Gold">
	</form>
	<h3>House<br>(earns 2-5 golds)</h3><br>
	<form action="process/3" method="post" >
		<input type="submit" name="house" value="Find Gold">
	</form>	
	<h3>Casino!<br>(earns/takes 0-50 golds)</h3><br>
	<form action="process/4" method="post">
		<input type="submit" name="casino" value="Find Gold">
	<br>
	<h3> Activities:</h3><br>
	<textarea rows="10" cols="100">${result}</textarea>
	</form>		
	
</body>
</html>