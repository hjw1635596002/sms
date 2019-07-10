package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.StudentCourse;
import com.briup.apps.sms.service.StudentCourseService;

@RestController
@RequestMapping("/studentCourse")
public class StudentCourseController {
	
	@Autowired
	private StudentCourseService studentCourseService;

	// http://localhost:8080/studentCourse/selectAll
	@GetMapping("selectAll")
	public List<StudentCourse> selectAll(){
		return studentCourseService.selectAll();
	}
	
	
	
	
	
}
