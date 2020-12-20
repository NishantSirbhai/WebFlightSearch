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
	<h1>Flight Search Form</h1>
	<h3>Search Flights Here</h3>
	<form:form action="/WebFlightSearch/searchFlight" method="POST"
		modelAttribute="searchParameters">
		<form:label path="departureLocation">
			Departure &nbsp Location :&nbsp &nbsp &nbsp
			</form:label>
		<form:input type="text" path="departureLocation" />
		<br>
		<br>
		<form:label path="arrivalLocation"> Arrival &nbsp Location :&nbsp &nbsp &nbsp</form:label>
		<form:input type="text" path="arrivalLocation" />
		<br>
		<br>
		<form:label path="departureDate"> Flight &nbsp Date :&nbsp &nbsp &nbsp</form:label>
		<form:input type="date" path="departureDate" />
		<br>
		<br>
		<form:label path="flightClass"> Flight &nbsp Class :&nbsp &nbsp &nbsp</form:label>
		<form:input type="text" path="flightClass" />
		<br>
		<br>
		<form:label path="outputPreferrence"> Output &nbsp Preferrence :&nbsp &nbsp &nbsp</form:label>
		<form:input type="text" path="outputPreferrence" />
		<br>
		<br>
		<input type="submit" value="submit"></input>
	</form:form>
</body>
</html>