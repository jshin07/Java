<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Person</title>
</head>
<body>
<h1>New Person</h1>

<h2 style="color:red">
	<c:forEach items="${errs}" var ="err">
		<p><c:out value= "${err.getDefaultMessage()}"/></p>
	</c:forEach>
</h2>	
	
	<form:form action="/license/create" method="post" modelAttribute="person">
	
		<form:label path="firstName">First Name:
			<form:input path="firstName"></form:input>
			<form:errors path="firstName"></form:errors>
		</form:label><br>
		
		<form:label path="lastName">Last Name:
			<form:input path="lastName"></form:input>
			<form:errors path="lastName"></form:errors>
		</form:label><br>
		
			
		<input type="submit" name="submit" value="Create"></input>			
		
	</form:form>	
	
	
	
</body>
</html>