package com.ControllerToUI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@GetMapping("/welcome")
	public ModelAndView welcomeMsg() {
		
		String msg = "Welcome To BikkadIT";
		ModelAndView mav = new ModelAndView();
		mav.addObject("MESSAGE",msg);
		mav.setViewName("welcome");
		return mav;
		
	}

}
