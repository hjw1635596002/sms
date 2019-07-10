package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.StudentCourse;
import com.briup.apps.sms.dao.StudentCourseDao;
import com.briup.apps.sms.service.StudentCourseService;

/**
 * 校园逻辑逻辑处理的实现类
 * */
@Service
public class StudentCourseServiceImpl implements StudentCourseService {
	
	@Resource
	private StudentCourseDao studentCourseDao;
	@Override
	public List<StudentCourse> selectAll() {
		// TODO Auto-generated method stub
		return studentCourseDao.selectAll();
	}

	@Override
	public void saveOrUpdate(StudentCourse studentcourse) throws Exception {
		if(studentcourse.getId()==null) {
			studentCourseDao.insert(studentcourse);
		} else {
			studentCourseDao.update(studentcourse);
		}
		
	}
		
	}
	
