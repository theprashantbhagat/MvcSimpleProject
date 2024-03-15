package com.SpringMvcCrud.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SpringMvcCrud.model.Student;

import com.SpringMvcCrud.service.StudentServicel;

@Controller
public class StudentController {
	
	@Autowired
	private StudentServicel studentServicel;

	@GetMapping("/home")
	public String loadForm() {
	
		return "regForm";
		
	}
	
	@GetMapping("/preUpdate")
	public String preUpadte() {
		return "preUpdate";
		
	}
	
	@GetMapping("/saveStu")
	public ModelAndView saveStu(Student stu) {
		Student student = studentServicel.saveStudent(stu);
		ModelAndView mav = new ModelAndView();
		mav.addObject("STUDENT", student);
		mav.setViewName("regSuccess");
		return mav;

	}
	
	@GetMapping("/getAllStu")
	public String getAllStudent(Model model){
		List<Student> allStudent = studentServicel.getAllStudent();
		model.addAttribute("STUDENTS", allStudent);
		return "students";
		
	}
	
	
	@GetMapping("/updateStudent")
	public ModelAndView updateStu(Student stu) {
		Student student = studentServicel.updateStudent(stu);
		ModelAndView mav = new ModelAndView();
		mav.addObject("UPDATESTUDENT", student);
		mav.setViewName("updateStu");
		return mav;
	}
		
		@GetMapping("/deleteById/{sid}")
		public ModelAndView deleteStudentById(@PathVariable int sid) {
			String deleteStdeuntById = studentServicel.deleteStudentById(sid);
			ModelAndView mav = new ModelAndView();
			mav.addObject("MSG", deleteStdeuntById);
			mav.setViewName("deleteStu");
			return mav;

		}
		@GetMapping("/deleteAll")
		public ModelAndView deleteAllstu() {
			String deleteAllStu = studentServicel.deleteAllStu();
			ModelAndView mav = new ModelAndView();
			mav.addObject("MSG", deleteAllStu);
			mav.setViewName("deleteAll");
			return mav;

	
	}
}
