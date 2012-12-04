package com.hp.it.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ReportController implements Controller
{

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView(request.getPathInfo().substring(1));
	}

}
