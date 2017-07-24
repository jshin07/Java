<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category Page</title>
</head>
<body>
	<h1>${categories.name}</h1>


	<form:form action="/categories/${categories.id}" method="post" modelAttribute="product">
	
		<form:label path="name">Add Product
			<form:select path="name">
				<c:forEach items="${products}" var="product">
					<form:option value=" ${product.id}" > <c:out value=" ${product.getName()} " /></form:option>
				</c:forEach>
			</form:select>	
		</form:label> <br>	
			
		<input type="submit" name="submit" value="Add"></input>		
		
	<h3>Products:</h3>	
	<c:forEach items="${categories.products}" var="product">
		<li><c:out value=" ${product.getName()} " /></li>
	</c:forEach>
		
		
	</form:form>	
</body>
</html>