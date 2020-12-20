package com.nagarro.search.flight.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nagarro.search.flight.web.constants.Constants;
import com.nagarro.search.flight.web.pojo.Flight;
import com.nagarro.search.flight.web.pojo.SearchParameters;
import com.nagarro.search.flight.web.service.FlightSearchService;

@Controller
public class FlightSearchController {
	@Autowired
	FlightSearchService flightSearchService;

	@RequestMapping(value = "/searchFlight", method = RequestMethod.POST)
	public String searchFlights(ModelMap map, @ModelAttribute("searchParameters") SearchParameters searchParameters,
			BindingResult result, HttpServletRequest request) {
		String viewName = Constants.VIEW_RESULT_PAGE;
		if (result.hasErrors()) {
			System.out.println(result.getAllErrors());
			viewName = Constants.VIEW_ERROR;
		}

		else {
			List<Flight> matchingFlights = new ArrayList<Flight>();
			matchingFlights = flightSearchService.matchingFlights(searchParameters);
			System.out.println(matchingFlights.size());
			map.addAttribute("matchingFlights", matchingFlights);
			viewName = Constants.VIEW_RESULT_PAGE;
		}
		return viewName;
	}

	@RequestMapping(value = "/postLoggedIn", method = RequestMethod.GET)
	public String loginPage(ModelMap map) {
		map.addAttribute("searchParameters", new SearchParameters());
		return "FlightSearchPage";
	}
}