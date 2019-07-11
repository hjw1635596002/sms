package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.School;
import com.briup.apps.sms.bean.SchoolMessage;

public interface SchoolDao {
	//查询所有
	List<School> selectAll();
	
	//插入
	void insert(School school);
	
	//修改
	void update(School school);
	
	// 通过ID删除
	void deleteById(long id);
	
	//查询根据name查询学校信息
	List<SchoolMessage> selectMessage();
	
}
