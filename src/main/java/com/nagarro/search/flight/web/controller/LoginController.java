package com.nagarro.search.flight.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nagarro.search.flight.web.constants.Constants;
import com.nagarro.search.flight.web.pojo.SearchParameters;
import com.nagarro.search.flight.web.pojo.User;
import com.nagarro.search.flight.web.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String authenticateLogin(ModelMap map, @ModelAttribute("user") User user, HttpServletRequest request,
			BindingResult result) {
		String viewName = Constants.VIEW_LOGIN_PAGE;
		if (result.hasErrors()) {
			viewName = Constants.VIEW_ERROR;
		} else {
			if (loginService.authenticateUser(user)) {
				viewName = Constants.VIEW_FLIGHT_SEARCH_PAGE;
				map.addAttribute("searchParameters", new SearchParameters());
				HttpSession session = request.getSession();
				session.setAttribute("username", user.getUsername());
			} else {
				map.addAttribute("user", new User());
				map.addAttribute("invalidLogin", "Invalid Login Credentials");
			}
		}
		return viewName;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loginPage(ModelMap map) {
		map.addAttribute("user", new User());
		return "LoginPage";
	}
}
