package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.mvc.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("student", new Student()); 
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid@ModelAttribute("student") Student theStudent, 
			BindingResult theBindingResult ) {
		
		System.out.println("Binding result: "+ theBindingResult); 
		System.out.println("\n\n\n\n\n"); 
		if(theBindingResult.hasErrors())
			return "student-form";
		else 
			return "student-confirmation"; 
	}
}
