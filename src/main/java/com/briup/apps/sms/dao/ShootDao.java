package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.School;

public interface ShootDao {
	//查询所有
	List<School> selectAll();
	
	//插入
	void insert(School school);
	
	//修改
	void update(School school);
	
}
