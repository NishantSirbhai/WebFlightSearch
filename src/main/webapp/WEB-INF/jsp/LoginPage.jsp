<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/WebFlightSearch/login" method="POST"
		modelAttribute="user">
		<form:label path="username">
			Username :&nbsp &nbsp &nbsp
			</form:label>
		<form:input type="text" path="username" />
		<br>
		<br>
		<form:label path="password"> Password :&nbsp &nbsp &nbsp</form:label>
		<form:input type="password" path="password" />
		<br>
		<br>
		<input type="submit" value="submit"></input>
	</form:form>
</body>
</html>
