<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Ninja</title>
</head>
<body>
	<h1>New Ninja</h1>
	
<h2 style="color:red">
	<c:forEach items="${errs}" var ="err">
		<p><c:out value= "${err.getDefaultMessage()}"/></p>
	</c:forEach>
</h2>		
	
<form:form action="/ninjas/new" method="post" modelAttribute="ninja">
	
		<form:label path="dojo">Dojo
			<form:select path="dojo">
				<c:forEach items="${dojos}" var="dojo">
					<form:option value=" ${dojo.id}" > ${dojo.name} </form:option>
				</c:forEach>
			</form:select>	
		</form:label> <br>
		
		<form:label path="firstName">First Name
			<form:input path="firstName"></form:input>
			<form:errors path="firstName"></form:errors>
		</form:label><br>
		
		<form:label path="lastName">Last Name
			<form:input path="lastName"></form:input>
			<form:errors path="lastName"></form:errors>
		</form:label><br>
		
				<form:label path="age">Age
			<form:input path="age"></form:input>
			<form:errors path="age"></form:errors>
		</form:label><br>
		
			
		<input type="submit" name="submit" value="Create"></input>			
		
	</form:form>	
	
	
	
</body>
</html>