package com.ilyas.thymeleafdemo.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ilyas.thymeleafdemo.dao.StudentRepository;
import com.ilyas.thymeleafdemo.entity.Student;



@Service
public class StudentServiceImp implements StudentService {

	private StudentRepository studentRepository;

	public StudentServiceImp(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> listAll() {

		return studentRepository.findAll();
	}


	@Override
	public void delete(int studentId) {

		studentRepository.deleteById(studentId);

	}

	@Override
	public Student getStudent(Integer studentId) {
		// TODO Auto-generated method stub
		Optional<Student> result = studentRepository.findById(studentId);
		Student stdnt = null;
		if (result.isPresent())
			stdnt = result.get();

		else
			throw new RuntimeException("No such id " + studentId);

		return stdnt;
	}

	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

}
