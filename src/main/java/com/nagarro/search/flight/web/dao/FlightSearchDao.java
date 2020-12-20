package com.nagarro.search.flight.web.dao;

import java.util.List;

import com.nagarro.search.flight.web.pojo.Flight;

public interface FlightSearchDao {

	public List<Flight> getFlights(String query);

}
