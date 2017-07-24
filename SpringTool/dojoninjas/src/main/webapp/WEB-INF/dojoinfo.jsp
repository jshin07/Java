<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dojo Page</title>
</head>
<body>
	<h1> ${dojos.name} Location</h1>
	
	<h2 style="color:red">
		<c:forEach items="${errs}" var ="err">
			<p><c:out value= "${err.getDefaultMessage()}"/></p>
		</c:forEach>
	</h2>		

		
	<table border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Age</th>	
		</tr>
		
		<c:forEach items="${ninjas}" var="ninja">
		<tr>
			<td><c:out value= "${ninja.firstName}"/></td>
			<td><c:out value= "${ninja.lastName}"/></td>
			<td><c:out value= "${ninja.age}"/></td>

		</tr>		
		</c:forEach>	
		
	</table>
		
		
		

</body>
</html>