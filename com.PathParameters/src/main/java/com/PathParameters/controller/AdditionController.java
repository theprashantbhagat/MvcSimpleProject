package com.PathParameters.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdditionController {
	@GetMapping("/squareroot")
	public ModelAndView getSquare (){
		String s = "Welcome";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("B", s);
		mav.setViewName("square");
		return mav;
		
	}
	
//	@GetMapping("/add/{no1}/{no2}")
//	public String twoNoAddition(@PathVariable int no1,@PathVariable int no2, Model model){
//	  int c = no1 + no2;
//	  model.addAttribute("C", c);
//	  return "add";
//	}

}
