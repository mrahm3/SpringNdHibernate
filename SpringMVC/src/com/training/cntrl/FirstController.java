package com.training.cntrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class FirstController implements Controller {

	
	@Autowired
	private ModelAndView mdl;
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		mdl.setViewName("Success");
		String message="You have configured successfully";
		mdl.addObject("msg", message);
		return mdl;
	}

}
