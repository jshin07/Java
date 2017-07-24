<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Dojo</title>
</head>
<body>
	<h1> New Dojo</h1>
	
	<h2 style="color:red">
	<c:forEach items="${errs}" var ="err">
		<p><c:out value= "${err.getDefaultMessage()}"/></p>
	</c:forEach>
	</h2>	
	
	<form:form action="/dojos/new" method="post" modelAttribute="dojos">
			
		<form:label path="name">Name
			<form:input path="name"></form:input>
			<form:errors path="name"></form:errors>
		</form:label><br>
				
		<input type="submit" name="submit" value="Create"></input>			
		
	</form:form>	
		
	
</body>
</html>