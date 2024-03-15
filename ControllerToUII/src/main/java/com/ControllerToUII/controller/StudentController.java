package com.ControllerToUII.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ControllerToUII.model.Student;

@Controller
public class StudentController {
	
	@GetMapping("/getSingleStu")
	public ModelAndView getSingleStu() {
		
		Student stu = new Student();
		stu.setSid(1);
		stu.setSname("Suchita");
		stu.setSaddr("Pune");
		stu.setAge(54);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("STU", stu);
		mav.setViewName("student");
		
		return mav;
		}
	
	@GetMapping("/getAllStu")
	public String getAllStu(Model model) {
		
		Student stu = new Student();
		stu.setSid(2);
		stu.setSname("Suchita");
		stu.setSaddr("Pune");
		stu.setAge(54);
		
		Student stu1 = new Student();
		stu1.setSid(2);
		stu1.setSname("Rahul");
		stu1.setSaddr("Chennai");
		stu1.setAge(56);
		
		Student stu2 = new Student();
		stu2.setSid(2);
		stu2.setSname("Ashok");
		stu2.setSaddr("Satara");
		stu2.setAge(57);
		
		ArrayList al = new ArrayList();
		al.add(stu);
		al.add(stu1);
		al.add(stu2);
		
		model.addAttribute("STUDENTS",al);
		return "students";
	}
	

}
