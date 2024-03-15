package com.UIToController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@GetMapping("/wel")
	public ModelAndView welcomeMsg(@RequestParam String name) {
		System.out.println(name);
		String msg = "Hii" +name+"Welcome To BikkadIT";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("MSG", msg);
		mav.setViewName("welcome");
		return mav;
		
		
	}

}
