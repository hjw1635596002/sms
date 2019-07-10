package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.StudentCourse;
import com.briup.apps.sms.bean.User;

public interface UserDao {
	//查询所有
	List<User> selectAll();
	
	//插入
	void insert(User user);
		
	//修改
	void update(User user);
	
}
