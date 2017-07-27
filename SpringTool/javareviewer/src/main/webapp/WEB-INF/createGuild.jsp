<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Beginning of Days... Team Creator</title>
</head>
<body>
	<h1>Welcom Iluvatar!</h1>
	
	<form id="logoutForm" method="POST" action="/logout">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Logout!" />
    </form>	<br>
	

	<table border="1">
		<th>Name</th>
		<th>Guild</th>
		<th>Age</th>
		<th>Action</th>
			
		<c:forEach items= "${allUsers}" var= "user">

		<tr> 
			<td><c:out value= "${user.firstName} ${user.lastName}"/>  </td>
				<c:forEach items="${user.guilds}" var="guild">
					<td><c:out value= "${guild.guildName}"/></td>
				</c:forEach>
					<td><c:out value= "${user.createdAt}"/> </td>
					<td><a href= "/deleteGuild/${guild.id}">Destroy</a> | <a href= "/makeAdmin/${user.id}">Make user Admin</a></td>
		
		</tr>
		</c:forEach>
		
	</table>
	<br><br>

	
	
	
	<form:form action="/newGuild" method="post" modelAttribute="guild">
		<form:label path="guildName">Guild Name:
			<form:input path="guildName" type="text" id="guildName"></form:input>
		</form:label><br>
		
		<form:label path="guildSize">Guild Size:
			<form:input path="guildSize" type="number" id="guildSize"></form:input>
		</form:label>		
		<br>
		<input type="submit" name="submit" value="CREATE">
	</form:form><br>
	
	<form:form action= "/join" method="post" modelAttribute="user">
		<form:label path= "firstName"> Name:
			<form:select path="firstName">
			<c:forEach items= "${allUsers}" var="user">
				<form:option value= "${user.id}"> ${user.firstName} ${user.lastName}</form:option>
			</c:forEach>
			</form:select>
		</form:label><br><br>

		<form:label path= "guilds"> Guild:
			<form:select path="lastName">
			<c:forEach items= "${allGuilds}" var="guild">
				<form:option value= "${guild.id}"> ${guild.guildName}</form:option>
			</c:forEach>
			</form:select>
		</form:label><br>
		
		
		<input type="submit" name="submit" value="JOIN">	
	</form:form>
	
	
	
	
	
	
</body>
</html>