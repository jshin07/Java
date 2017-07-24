<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New License</title>
</head>
<body>
<h1>New License</h1>

<h2 style="color:red">
	<c:forEach items="${errs}" var ="err">
		<p><c:out value= "${err.getDefaultMessage()}"/></p>
	</c:forEach>
</h2>	


	<form:form action="/license/new" method="post" modelAttribute="license">
	
		<form:label path="person">Person
			<form:select path="person">
				<c:forEach items="${persons}" var="person">
					<form:option value=" ${person.id}" > ${person.getFirstName()} ${person.getLastName()} </form:option>
				</c:forEach>
			</form:select>	
		</form:label> <br>
		
		<form:label path="state">State
			<form:input path="state"></form:input>
			<form:errors path="state"></form:errors>
		</form:label><br>
		
		<form:label path="expiration_date">Expiration Date
			<form:input path="expiration_date" type="date"></form:input>
			<form:errors path="expiration_date"></form:errors>
		</form:label><br>		
		
			
		<input type="submit" name="submit" value="Create"></input>			
		
	</form:form>	
	
	

</body>
</html>