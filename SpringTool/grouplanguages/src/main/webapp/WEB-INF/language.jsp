<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CRUD Assignment</title>
</head>
<body>
<h1>
<p><c:out value="${language.name}"/></p>
<p><c:out value="${language.creator}"/></p>
<p><c:out value="${language.version}"/></p>

<a href="/languages/edit/${index}" method="post" modelAttribute="language"> Edit </a><br>
<a href="/languages/delete/${index}" method="post" modelAttribute="language"> Delete </a>
</h1>
</body>
</html>
