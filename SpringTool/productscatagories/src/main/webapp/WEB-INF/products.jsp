<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Page</title>
</head>
<body>



<h1> <c:out value= "${products.name}" />    </h1>

	<form:form action="/products/${products.id}" method="post" modelAttribute="category">
	
		<form:label path="name">Add Category  
			<form:select path="name">
				<c:forEach items="${categories}" var="category">
					<form:option value=" ${category.id}" > <c:out value=" ${category.getName()} " /> </form:option>
				</c:forEach>
			</form:select>	
		</form:label> <br>	
			
		<input type="submit" name="submit" value="Add"></input>			
		
	</form:form>	
	
	<h3>Categories:</h3>
	
	<c:forEach items="${products.categories}" var="product">
		<li><c:out value=" ${product.getName()} " /></li>
	</c:forEach>
	
</body>
</html>