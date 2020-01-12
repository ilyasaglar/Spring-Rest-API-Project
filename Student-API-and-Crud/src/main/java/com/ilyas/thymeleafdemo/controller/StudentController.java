package com.ilyas.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ilyas.thymeleafdemo.entity.Student;
import com.ilyas.thymeleafdemo.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping("/list")
	public String showList(Model model) {

		List<Student> students = studentService.listAll();

		model.addAttribute("stdntList", students);
		return "student/student";
	}

	@GetMapping("/add")
	public String showFormEmpty(Model model) {
		Student stdnt = new Student();
		stdnt.setTcKimlikNo("");
		
		stdnt.setFirstName("");
		stdnt.setLastName("");
		stdnt.setBorcTutari("500");
		stdnt.setBorcDurumu("Ödenmedi");
		

		model.addAttribute("student", stdnt);
		return "student/add-form";
	}
	
	@PostMapping("/save")
	public String saveForm(@ModelAttribute("student") Student stdnt) {

		studentService.save(stdnt);
		return "redirect:/student/list";
	}

	@GetMapping("/update")
	public String showFormUpdate(@RequestParam("studentId") int stdntId, Model model) {

		Student stdent = studentService.getStudent(stdntId);

		model.addAttribute("student", stdent);
		return "student/add-form";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("studentId") int stdntId, Model model) {

		studentService.delete(stdntId);
		return "redirect:/student/list";
	}

}
