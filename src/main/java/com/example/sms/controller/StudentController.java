package com.example.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.sms.service.StudentService;

@Controller
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	// handler method to handle list student and return mode and view
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());

		return "students";
	}
	
	
	/*
	 * @GetMapping("/students2") // this is the URL for UI to call public String
	 * listStudents2(Model model) { // argument model.addAttribute("students",
	 * studentService.getAllStudents()); // add data to the model return "students";
	 * // students -> ni adalah view name // kita nak display list of students ni
	 * dalam file students.html }
	 */
	
	
}
