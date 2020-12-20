package com.nagarro.search.flight.web.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airlines")
public class Flight {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "FLIGHT_NO")
	public String flightNumber;
	@Column(name = "DEP_LOC")
	public String flightDepartureLocation;
	@Column(name = "ARR_LOC")
	public String flightArrivalLocation;
	@Column(name = "VALID_TILL")
	public Date flightValidTill;
	@Column(name = "FLIGHT_TIME")
	public String flightTime;
	@Column(name = "FLIGHT_DUR")
	public Double flightDuration;
	@Column(name = "FARE")
	public Double flightFare;
	@Column(name = "SEAT_AVAILABILITY")
	public Character flightSeatAvailability;
	@Column(name = "CLASS")
	public String flightClass;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightDepartureLocation() {
		return flightDepartureLocation;
	}

	public void setFlightDepartureLocation(String flightDepartureLocation) {
		this.flightDepartureLocation = flightDepartureLocation;
	}

	public String getFlightArrivalLocation() {
		return flightArrivalLocation;
	}

	public void setFlightArrivalLocation(String flightArrivalLocation) {
		this.flightArrivalLocation = flightArrivalLocation;
	}

	public Date getFlightValidTill() {
		return flightValidTill;
	}

	public void setFlightValidTill(Date flightValidTill) {
		this.flightValidTill = flightValidTill;
	}

	public String getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}

	public Double getFlightDuration() {
		return flightDuration;
	}

	public void setFlightDuration(Double flightDuration) {
		this.flightDuration = flightDuration;
	}

	public Double getFlightFare() {
		return flightFare;
	}

	public void setFlightFare(Double flightFare) {
		this.flightFare = flightFare;
	}

	public Character getFlightSeatAvailability() {
		return flightSeatAvailability;
	}

	public void setFlightSeatAvailability(Character flightSeatAvailability) {
		this.flightSeatAvailability = flightSeatAvailability;
	}

	public String getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}

}
