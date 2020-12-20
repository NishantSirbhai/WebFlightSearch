package com.nagarro.search.flight.web.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nagarro.search.flight.web.dao.FlightSearchDao;
import com.nagarro.search.flight.web.pojo.Flight;

@Repository
public class FlightSearchDaoImpl implements FlightSearchDao {
	@Autowired
	public SessionFactory sessionFactory;

	public List<Flight> getFlights(String query) {
		List<Flight> allFlights = new ArrayList<Flight>();
		allFlights = sessionFactory.getCurrentSession().createQuery(query).list();
		return allFlights;
	}
}
