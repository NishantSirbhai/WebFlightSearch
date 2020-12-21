package com.nagarro.search.flight.web.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SearchParameters {
	private String departureLocation;
	private String arrivalLocation;
	@DateTimeFormat(pattern = "yy-MM-dd")
	private Date departureDate;
	private String flightClass;
	private String outputPreferrence;

	public String getDepartureLocation() {
		return departureLocation;
	}

	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}

	public String getArrivalLocation() {
		return arrivalLocation;
	}

	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public String getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}

	public String getOutputPreferrence() {
		return outputPreferrence;
	}

	public void setOutputPreferrence(String outputPreferrence) {
		this.outputPreferrence = outputPreferrence;
	}
	// To check scm polling trigger on jenkins
}
