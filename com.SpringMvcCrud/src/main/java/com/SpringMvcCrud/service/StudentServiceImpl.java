package com.SpringMvcCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.SpringMvcCrud.model.Student;
import com.SpringMvcCrud.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServicel {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student stu) {
		Student save = studentRepository.save(stu);
		return save;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> findAll = (List<Student>) studentRepository.findAll();
		return findAll;
	}

	@Override
	public Student updateStudent(Student stu) {
		Student student = studentRepository.save(stu);
		return student;
	}

	@Override
	public String deleteStudentById(int sid) {
		boolean existsById = studentRepository.existsById(sid);
		if (existsById) {
			studentRepository.deleteById(sid);
			return "Student deleted Successfully";
		} else {
			return "Student not deleted Successfully";
		}
	}

	@Override
	public String deleteAllStu() {
		List<Student> findAll = (List<Student>) studentRepository.findAll();
		if(findAll.isEmpty()) {
			return "Records not deleted";
		}else {
	studentRepository.deleteAll();
		return "All Students deleted Successfully";
	}
	
	
	}
}
