package com.nagarro.search.flight.web.create.query;

import com.nagarro.search.flight.web.constants.Constants;

public class QueryBuilder {
	public static String createQuery(String outputPreferrence) {
		String query = "FROM Flight F ";
		if (Constants.SORT_BY_FARE.equals(outputPreferrence)) {
			query = query.concat("order by F.flightFare");
		} else if (Constants.SORT_BY_FARE_AND_FLIGHT_DURATION.equals(outputPreferrence)) {
			query = query.concat("order by F.flightFare,F.flightDuration");
		}
		return query;
	}
}
