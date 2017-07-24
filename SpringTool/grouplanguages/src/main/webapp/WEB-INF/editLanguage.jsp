<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CRUD Assignment</title>
</head>
<body>

<h1>
	<form:form action="/languages/edit/${index}" method="post" modelAttribute="language">
	
		<form:label path="name"> Name
			<form:input path="name"></form:input>
			<form:errors path="name"></form:errors>
		</form:label> 
		<form:label path="creator"> Creator
			<form:input path="creator"></form:input>
			<form:errors path="creator"></form:errors>
		</form:label>
		<form:label path="version"> Version
			<form:input path="version"></form:input>
			<form:errors path="version"></form:errors>
		</form:label>	
		
			
		<input type="submit"></input>			
		
	</form:form>
	
</h1>
	





</body>
</html>