package com.SpringMvcCrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringMvcCrud.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
