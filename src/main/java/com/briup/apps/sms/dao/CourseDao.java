package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.Course;

public interface CourseDao {
	List<Course>  selectAll();
	//查询所有
void insert(Course course);
    //插入
void update(Course course);
    //更新
}