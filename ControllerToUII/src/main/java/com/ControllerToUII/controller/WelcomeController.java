package com.ControllerToUII.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public ModelAndView welcomeMsg() {
	
		String msg = "Welcome To BikkadIT Pune";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("MESSAGE", msg);
		mav.setViewName("welcome");
		return mav;
}
   @GetMapping("/welcome1")
   public String welcomeMsg1(Model model) {
	
	   String msg = "Welcome to BikkadIT Pune";
	   model.addAttribute("WELMSG", msg);
	
	return "welcome1";
	
	
   }
}
