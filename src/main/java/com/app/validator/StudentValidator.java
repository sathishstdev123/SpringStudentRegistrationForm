package com.app.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.app.bean.Student;
@Component
public class StudentValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return  Student.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
			Student  s=(Student)target;
			
			
	if(!Pattern.matches("[0-9]{12}", s.getStdId())) {
		errors.rejectValue("stdId", null, "Please enter Valid ID");
	}
	if(!Pattern.matches("[A-Za-z]{3,12}", s.getStdName())) {
		errors.rejectValue("stdName", null, "Please enter the Valid Name");
	}
	if(!StringUtils.hasText(s.getMonth())) {
		errors.rejectValue("month", null, "Please select Month");
	}
	if(!StringUtils.hasText(s.getDay())) {
		errors.rejectValue("day", null, "Please select Date");
	}
	if(!StringUtils.hasText(s.getYear())) {
		errors.rejectValue("year", null, "Please Select Year");
	}
	if(!StringUtils.hasText(s.getStdGen())) {
		errors.rejectValue("stdGen", null, "Please Select Gender");
	}
	if(!StringUtils.hasText(s.getStdCourse())) {
		errors.rejectValue("stdCourse", null, "Please Select Course");
	}
	if(!StringUtils.hasText(s.getStdCntry())) {
		errors.rejectValue("stdCntry", null, "Please Choose Country");
	}
	if(!Pattern.matches("[A-Za-z]{3,25}", s.getStdAddr())) {
		errors.rejectValue("stdAddr", null, "Please enter Address");
	}
	if(!Pattern.matches("[A-Za-z]{3,10}", s.getStdCity())) {
		errors.rejectValue("stdCity", null, "Please enter City");
	}
	if(!Pattern.matches("[A-Za-z]{3,12}", s.getStdState())) {
		errors.rejectValue("stdState", null, "Please enter State");
	}
	if(!Pattern.matches("[0-9]{10}", s.getStdMobile())) {
		errors.rejectValue("stdMobile", null, "Please enter Mobile number");
	}
	if(!Pattern.matches("[A-Za-z]{3,15}", s.getStdEmail())) {
		errors.rejectValue("stdEmail", null, "Please enter the Valid Name");
	}
	
	
	}

}
