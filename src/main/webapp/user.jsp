<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Current User: 
	<security:authorize access="isAuthenticated()">
    authenticated as <security:authentication property="principal.username" /> 
</security:authorize>
<security:authentication property="principal.username" />

<br>
</h1>

</body>
</html>