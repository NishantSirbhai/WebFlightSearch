package com.nagarro.search.flight.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoggedInInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		boolean value = false;
		HttpSession session = request.getSession();
		if (session.getAttribute("username") == null) {
			value = true;
		} else {
			response.sendRedirect(request.getContextPath() + "/postLoggedIn");
		}
		return value;
	}
}
