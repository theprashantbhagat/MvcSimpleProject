package com.UIToController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {
	
	@GetMapping("/getCourse")
	public ModelAndView getCoursedtls(@RequestParam String cname, @RequestParam String tname) {
		System.out.println(cname+""+tname);
		
		String data = cname+" How are you " + tname;
		ModelAndView mav = new ModelAndView();
		mav.addObject("DATA", data);
		mav.setViewName("course");
		
		return mav;
		//UI to Controller:localhost:1234/wel?name=suchita
		//localhost:1234/getCourse?cname=java&tname=sandeep
		
	}

}
