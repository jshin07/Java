<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile Page</title>
</head>
<body>

	<h1><c:out value= "${person.getFirstName()} ${person.getLastName()}" /></h1>
	
	<h3>License Number: ${license.getNumber()} </h3>
	<h3>State: ${license.getState()} </h3>
	<h3>Expiration Date: <fmt:formatDate pattern = "MM/dd/YYYY" 
         value = "${license.getExpiration_date()}" /></h3>
	
	

</body>
</html>