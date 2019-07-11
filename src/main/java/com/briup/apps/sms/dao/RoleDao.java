package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.Role;

public interface RoleDao {
    List<Role>selectAll();
    
    void insert(Role role);
    
    void update(Role role);
   
    //通过ID删除
    
    void deleteById(long id);
    
    
    
}
