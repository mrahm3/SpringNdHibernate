package com.training.ctrls;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.CarRental;

@Controller
public class ShowRequestsController {

	 
	@Autowired
	ModelAndView mdlView;
	
	@RequestMapping("/showAll")
	public String getAllRequests(Model model){
		List<CarRental> reqData= new ArrayList<CarRental>();
		
		reqData.add(new CarRental("Ramesh",9891818660L,"ramesh@abc.com","Innova"));
		reqData.add(new CarRental("Rajesh",9891818661L,"rajesh@abc.com","Swift"));
		reqData.add(new CarRental("Rakesh",9891818662L,"rakesh@abc.com","Xylo"));
		
		model.addAttribute("reqList", reqData);
		return "ShowAllRequest";
	}
	
	@RequestMapping(value="/findRequest/{custName}",method=RequestMethod.GET)
	public String viewCustomerAddress(@PathVariable("custName") String custName,Model model){
		
		
		String msg="10 Bookings of" +custName;
		if(custName.equals("Ramesh"))
		{
			msg="20 Bookings of"+custName;
		}
		model.addAttribute("data", msg);
		if(custName.equals("Rakesh"))
		{
			throw new RuntimeException();
		}
		return "Display";
	}
	@ExceptionHandler(java.lang.RuntimeException.class)
	public ModelAndView handleException(HttpServletRequest req,RuntimeException ex){
		mdlView.addObject("msg", "Runtime Exception Handler Called");
		mdlView.addObject("url", req.getRequestURL());
		mdlView.addObject("exception", ex);
		mdlView.setViewName("RunTimeHandler");
		return mdlView;
	}
}
