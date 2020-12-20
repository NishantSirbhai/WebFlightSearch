package com.nagarro.search.flight.web.service;

import java.util.List;

import com.nagarro.search.flight.web.pojo.Flight;
import com.nagarro.search.flight.web.pojo.SearchParameters;

public interface FlightSearchService {

	public List<Flight> matchingFlights(SearchParameters searchParameters);
}
