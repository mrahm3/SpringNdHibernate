package com.training.ctrls;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.CarRental;

@Controller
public class CarControlller {
  
	@RequestMapping("/")
	public String initApp(){
		return "index";
	}
	
	@Autowired
	CarRental cr;
	
	@Autowired
	ModelAndView mdlView;
	
	@ModelAttribute("type")
	public String[] getType(){
		return new String[] {"Sedan AC","Sedan NAC","Luxury Car"};
		
	}
	
	@RequestMapping(name="/CarRequest", method=RequestMethod.GET)
	public ModelAndView initRequest(){
		mdlView.setViewName("AddCarRequest");
		mdlView.addObject("command", cr);
		return mdlView;
	}
	
	@RequestMapping(name="/CarRequest",  method=RequestMethod.POST)
	public String onSubmit(@Valid @ModelAttribute("command") CarRental cr,BindingResult result)
	{
		
		String nextStep="Welcome";
		if(result.hasErrors()){
			nextStep="AddCarRequest";
		}
		return nextStep;
	}
	
	@RequestMapping("cust/check")
	public String checkStatus(@RequestParam("name") String name,Model mdlView)
	{
		mdlView.addAttribute("prevBooking", "your previous booking was on 12th march");
		return "Welcome";
	}
}
