package com.ControllerToUII.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {
	
	@GetMapping("/greetMessage")
	public ModelAndView greetMsg() {
		
		String grtMsg = "Good Evening All";
		ModelAndView mav = new ModelAndView();
		mav.addObject("GREETMSG",grtMsg);
		mav.setViewName("greet");
		return mav;
	}
	@GetMapping("/greet1")
	public String greet1(Model model) {
		String msg = "Good Night All";
		model.addAttribute("MSG", msg);
		return "greet1";
		
	}

}
