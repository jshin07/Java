<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Time Dashboard</title>
</head>
<body>
	<span id="time">
		<h2><fmt:formatDate value="${currentTime}" pattern="hh"/>:<fmt:formatDate value="${currentTime}" pattern="mm"/> <fmt:formatDate value="${currentTime}" pattern="aa"/></h2>
	</span>
</body>
</html>