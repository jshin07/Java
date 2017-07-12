<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Great Number Game</title>
</head>
<style>
	* {
		text-align: center;	
		padding: 0px;
		margin: auto;
	}
	.green{
		background-color: green;
		width: 100px;
		height: 100px;
	}
	
	.red{
		background-color: red;
		width: 100px;
		height: 100px;
	}

</style>
<body>
	<h1> Welcome to the Great Number Game!</h1>
	<h3> I am thinking about a number between 1-50.<br>Take a guess!</h3>

		
	<% String result = (String) request.getAttribute("result"); %>

	<% if(result == "You won") {%>
		<div class="green">
			<p> You won! ${num} was the number!</p>
		</div>
	<%} else if(result == "Too low") {%>
		<div class="red">
			<p> Too low! <p>
		</div>
	<% }else  if(result == "Too high"){ %>		
		<div class="red">
			<p> Too high! </p>
		</div>
	<%} %>	
		
	
	<form action = "/GreatNumberGame/index" method="POST">
		<input type= "text" name="guess">
		<input type= "submit" name="submit" value= "Submit">
	</form>

</body>
</html>