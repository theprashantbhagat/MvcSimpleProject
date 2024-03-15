package com.UIToController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.UIToController.model.Student;

@Controller
public class StudentController {
	
	@GetMapping("/home")
	public String loadForm() {
		
		return "regForm";
	}
	
	@GetMapping("/saveStu")
	public ModelAndView saveStudent(@RequestBody Student stu) {
		System.out.println(stu);
		ModelAndView mav = new ModelAndView();
		mav.addObject("STU", stu);
		mav.setViewName("regSuccess");
		return mav;
	}

}
