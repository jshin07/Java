<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Category</title>
</head>
<body>
	<h1> New Category</h1>
	
	<h4 style="color:red">
	<c:forEach items="${errs}" var ="err">
		<p><c:out value= "${err.getDefaultMessage()}"/></p>
	</c:forEach>
	</h4>
	
	
	<form:form action="/categories/new" method="post" modelAttribute="category">
	
		<form:label path="name"> Name:
			<form:input path="name"></form:input>
			<form:errors path="name"></form:errors>
		</form:label><br>
		

			
		<input type="submit" name="submit" value="Create"></input>			
		
	</form:form>	
	
	
	
</body>
</html>