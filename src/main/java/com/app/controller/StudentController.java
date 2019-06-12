package com.app.controller;

import javax.xml.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.bean.Student;
import com.app.validator.StudentValidator;

@Controller
@RequestMapping("/sdnt")
public class StudentController {
	@Autowired
	private StudentValidator validator;

	@RequestMapping("/reg")
	public String showReg(ModelMap map) {
		Student st=new Student(); 
		map.addAttribute("student",st);
		return "Register";
	}
	@RequestMapping("/save")
	public ModelAndView showData(@ModelAttribute Student student,Errors errors) {

		validator.validate(student, errors);
		ModelAndView m=new ModelAndView();
		if(errors.hasErrors()) {
			m.setViewName("Register");
		}
		else {
			m.setViewName("Data");
			m.addObject("stud",student);
		}
		return m;
	}
}
