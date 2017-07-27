<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Rings of Power</title>
</head>
<body>
	<style>
		h4 {
		width: 350px;
		}
	</style>
	<h1>Welcome <c:out value="${currentUser.firstName}"></c:out></h1>

	<h4>Welcome to your awesome magical ring finder, put the ring on, only good things will happen. <br>Maybe it'll make you live forever, go invisible, turn your inherent hunger for riches or power into an insatiable curse that eventually dooms your entire species.</h4>
	  
	  <form id="logoutForm" method="POST" action="/logout">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Logout!" />
    </form>	<br>
  
  	<c:choose>  
	  	<c:when test= "${currentUser.isAdmin() }">
		    <a href="/ringCreator"> Ring Creator (Powerful Ainur Only)</a>	<br>
		    <a href="/teamCreator"> Person/Team Creator (Powerful Ainur Only)</a>
		    <br><br>
	    </c:when>
	    
	    <c:otherwise>
	    	<a href=""> Ring Creator (Powerful Ainur Only)</a>	<br>
		    <a href=""> Person/Team Creator (Powerful Ainur Only)</a>
		    <br><br>
	    
	    </c:otherwise>
	    
    </c:choose>


    <form:form action="/bind_darkness" method="post" modelAttribute="ring">
    	<form:label path="ringName">Ring of Power
    		<form:select path="ringName">
    		<c:forEach items="${allRings}" var="ring">
    			<form:option value= "${ring.id}"> ${ring.ringName}</form:option>
    		</c:forEach>
    		</form:select>
    		
    	</form:label><br>
    	<input type= "submit" name="submit" value="BIND YOURSELF IN DARKNESS">
    </form:form>
    <br><br>
    
    <table border="1">
    	<th> Rings you have found </th>
    	<th> Action </th>
    	<c:forEach items="${allRings}" var="ring">
	    	<tr>
	    		<td><c:out value= "${ring.id}" /></td>
	    		<td><a href="/deleteRing/${ring.id}">Lose the Ring (Delete)</a></td>
	    	</tr>
    	</c:forEach>
    </table>

    


  
    
</body>
</html>