<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.headers td {
	text-align: center;
	bgcolor: #F7DC6F;
}

.rows td {
	text-align: center;
	bgcolor: #1ABC9C;
}
</style>
</head>
<body>
	<c:choose>
		<c:when test="${not empty matchingFlights}">
			<p>Matching Flights Found</p>

			<table border="1">
				<tr>
					<td class=".headers ${td}" align="center" bgcolor="#F7DC6F">Flight
						Number</td>
					<td align="center" bgcolor="#F7DC6F">Departure Location</td>
					<td align="center" bgcolor="#F7DC6F">Arrival Location</td>
					<td align="center" bgcolor="#F7DC6F">Valid Till</td>
					<td align="center" bgcolor="#F7DC6F">Time</td>
					<td align="center" bgcolor="#F7DC6F">Duration</td>
					<td align="center" bgcolor="#F7DC6F">Fare</td>
					<td align="center" bgcolor="#F7DC6F">Seat Availability</td>
					<td align="center" bgcolor="#F7DC6F">Class</td>
				</tr>
				<tr>

					<c:forEach items="${ matchingFlights }" var="Flight">
						<tr>
							<td align="center" bgcolor="#1ABC9C">${Flight.flightNumber}</td>
							<td align="center" bgcolor="#1ABC9C">${Flight.flightDepartureLocation}</td>
							<td align="center" bgcolor="#1ABC9C">${Flight.flightArrivalLocation}</td>
							<td align="center" bgcolor="#1ABC9C">${Flight.flightValidTill}</td>
							<td align="center" bgcolor="#1ABC9C">${Flight.flightTime}</td>
							<td align="center" bgcolor="#1ABC9C">${Flight.flightDuration}</td>
							<td align="center" bgcolor="#1ABC9C">${Flight.flightFare}</td>
							<td align="center" bgcolor="#1ABC9C">${Flight.flightSeatAvailability}</td>
							<td align="center" bgcolor="#1ABC9C">${Flight.flightClass}</td>
						</tr>
						<br>
					</c:forEach>
			</table>
		</c:when>
		<c:otherwise>No matching flights found</c:otherwise>
	</c:choose>
</body>
</html>