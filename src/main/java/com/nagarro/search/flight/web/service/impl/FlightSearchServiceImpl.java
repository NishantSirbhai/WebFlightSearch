package com.nagarro.search.flight.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nagarro.search.flight.web.constants.Constants;
import com.nagarro.search.flight.web.create.query.QueryBuilder;
import com.nagarro.search.flight.web.dao.FlightSearchDao;
import com.nagarro.search.flight.web.pojo.Flight;
import com.nagarro.search.flight.web.pojo.SearchParameters;
import com.nagarro.search.flight.web.service.FlightSearchService;

@Service
public class FlightSearchServiceImpl implements FlightSearchService {
	@Autowired
	public FlightSearchDao flightSearchDao;

	@Transactional
	public List<Flight> matchingFlights(SearchParameters searchParameters) {
		String query = QueryBuilder.createQuery(searchParameters.getOutputPreferrence());
		System.out.println(query);
		List<Flight> allFlights = flightSearchDao.getFlights(query);
		List<Flight> matchingFlights = new ArrayList<Flight>();
		for (int i = 0; i < allFlights.size(); i++) {
			if (isMatchingFlight(allFlights.get(i), searchParameters)) {
				matchingFlights.add(allFlights.get(i));
			}
		}
		return matchingFlights;
	}

	public boolean isMatchingFlight(Flight flight, SearchParameters searchParameters) {
		boolean result = false;
		if ((flight.getFlightDepartureLocation().equals(searchParameters.getDepartureLocation()))
				&& (flight.getFlightArrivalLocation().equals(searchParameters.getArrivalLocation()))
				&& (flight.getFlightValidTill().compareTo(searchParameters.getDepartureDate()) >= 0)
				&& (flight.getFlightClass().contains(searchParameters.getFlightClass()))
				&& (Constants.SEAT_AVAILABILITY_YES.equals(flight.getFlightSeatAvailability()))) {
			result = true;
		}
		return result;
	}

}
