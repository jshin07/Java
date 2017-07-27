<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Dashboard</title>
</head>
<body>
<h1>Admin Dashboard</h1><br>
	<h1>Welcome <c:out value="${currentUser.firstName}"></c:out></h1>
	
	  <form id="logoutForm" method="POST" action="/logout">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Logout!" />
    </form>	<br>	
    
    
    <h3>Customers</h3>
    <table border="1">
        <th> Name </th>
   		<th> Next Due Date </th>
    	<th> Amount Due </th>
    	<th> Package Type </th>
    
    <c:forEach items="${allUsers}" var="user" varStatus="loop">

    <tr> 
    	<td><c:out value="${user.firstName} ${user.lastName}"/></td>
    	<td><c:out value="${user.subscriptions}"/></td>
    	<td><c:out value="${user.createdAt}"/>AMOUNT DUE</td>
    	<td><c:out value="${user.createdAt}"/>PACKAGE TYPE</td>
    </tr>
    
	 </c:forEach>
    
    </table>
    
    
    <h3>Packages</h3>
    <table border="1">
        <th> Package Name </th>
   		<th> Package Cost </th>
    	<th> Available </th>
    	<th> Users </th>
    	<th> Actions </th>
    
    <c:forEach items="${subscriptions}" var="subscription" varStatus="loop">

    <tr> 
    	<td><c:out value="${subscription.subscriptionName}"/></td>
    	
    	
    	<td><c:out value="${subscription.price}"/></td>
    	<td>
	    	<c:choose>
	    		<c:when test = "${subscription.isStatus() }">
	    			Available
	    		</c:when>
	    		<c:otherwise>
	    			 Unavailable
	    		</c:otherwise>
	    	</c:choose>
    	</td>
    	<td><c:out value="${subscription.id}"/># of users</td>
    	
    	
    	 <td>
	    	<c:choose>
	    		<c:when test = "${subscription.isStatus() }">
	    			<a href="/deactivate/${subscription.id}"> Deactivate</a>	    			
	    		</c:when>
	    		<c:otherwise>
	    			<a href= "/activate/${subscription.id}">Activate</a>
	    		</c:otherwise>
	    	</c:choose>
    	</td>
    	
    	
    	
    </tr>
    
	 </c:forEach>
    
    </table>
    
     <h3>Create Package</h3>
     <form:form method="POST" action="/addPackage" modelAttribute="subscription">
      <p>
            <form:label path="subscriptionName">Package Name:</form:label>
            <form:input path="subscriptionName"/>
        </p>
        <p>
            <form:label path="price">Cost:</form:label>
            <form:input path="price"/>
        </p>    


        <input type="submit" value="Create New Package"/>
    </form:form>
    
    
    
    
</body>
</html>