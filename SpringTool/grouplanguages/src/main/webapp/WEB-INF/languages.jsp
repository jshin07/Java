<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CRUD Assignment</title>
</head>
<body>
<h1 style="color:red">
	<c:forEach items="${errs}" var ="err">
		<c:out value="${err.getDefaultMessage()}"/><br>
	</c:forEach>
</h1>	

<h1>
	<table border="1px solid black">
		<tr>
			<th>Name </th>
			<th>Creator</th>
			<th>Version</th>
			<th>Action </th>
		</tr>		
		<c:forEach items="${languages}" var="language" varStatus="loop">
			<tr>
				<td><a href="/languages/show/${loop.index}"> ${language.name}</a></td>
				<td>${language.creator}</td>
				<td>${language.version}</td>
				<td><a href="/languages/edit/${loop.index}">Edit</a> <a href="/languages/delete/${loop.index}">Delete</a></td>
				
			</tr>
		</c:forEach>
	</table><br>
	
	<form:form action="/languages/new" method="post" modelAttribute="language">
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