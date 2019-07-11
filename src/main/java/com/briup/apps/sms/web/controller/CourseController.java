package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.Course;
import com.briup.apps.sms.bean.CourseExtend;
import com.briup.apps.sms.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private CourseService courseService;
	@PostMapping("saveOrUpdata")
	public String saveOrUpdata(Course course) {
		try {
			courseService.saveOrUpdate(course);
			return "保存或更新成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return e.getMessage();
		}
	}

	// http://localhost:8080/course/selectAll
	@GetMapping("selectAll")
	public List<Course> selectAll(){
		return courseService.selectAll();
	}
	
	@GetMapping("selectAllWithTeacher")
	public List<CourseExtend> selectAllWithTeacher(){
		return courseService.selectAllWithTeacher();
	}
	// http://localhost:8080/course/deleteById?Id=3
	@GetMapping("deleteById")
	public String deleteById(long id) {
		
	try {
		courseService.deleteById(id);
		return "删除成功";
	} catch (Exception e) {
		e.printStackTrace();
		return e.getMessage();
	}
	}
	}
