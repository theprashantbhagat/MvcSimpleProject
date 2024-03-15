package com.SpringMvcCrud.service;

import java.util.List;

import com.SpringMvcCrud.model.Student;

public interface StudentServicel {
     
	public Student saveStudent(Student stu);

	public List<Student> getAllStudent();
	
	public Student updateStudent(Student stu);

	public String deleteStudentById(int sid);
	
	public String deleteAllStu();
}
