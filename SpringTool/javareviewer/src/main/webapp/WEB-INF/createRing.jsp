<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forge Ring of Power</title>
</head>
<body>
	<h4> Forge Ring of Power</h4>
	<p><form:errors path="ring.*"/></p>
	<form:form action="/newRing" method="post" modelAttribute="ring">
		<form:label path="ringName">Name:
			<form:input path="ringName" type="text" id="ringName"></form:input>
		</form:label>
		<input type="submit" name="submit" value="CREATE">
	</form:form>
</body>
</html>