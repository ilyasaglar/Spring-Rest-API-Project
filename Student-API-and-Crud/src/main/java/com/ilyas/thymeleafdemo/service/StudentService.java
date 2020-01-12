package com.ilyas.thymeleafdemo.service;

import java.util.List;

import com.ilyas.thymeleafdemo.entity.Student;



public interface StudentService {
	
	
	public Student getStudent(Integer empId);
	
	public List<Student> listAll();
	
	public Student save(Student student);
	
	public void delete(int studentId);
	
	
}
