package com.briup.apps.sms.service;

import java.util.List;

import com.briup.apps.sms.bean.School;
import com.briup.apps.sms.bean.SchoolMessage;

public interface SchoolService {
	
	List<School> selectAll();
	
	List<SchoolMessage> selectMessage();
	
	void saveOrUpdate(School school) throws Exception;
	
	void deleteById(long id) throws Exception;
}
