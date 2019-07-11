package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.Course;
import com.briup.apps.sms.bean.CourseExtend;

public interface CourseDao {
	List<Course>  selectAll();
	List<CourseExtend> selectAllWithTeacher();
	//查询所有
void insert(Course course);
    //插入
void update(Course course);
    //更新
void deleteById(long id);
    //通过Id删除
}