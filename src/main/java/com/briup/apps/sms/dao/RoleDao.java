package com.briup.apps.sms.dao;
/***
 * 
 * 角色信息
 */
public class RoleDao {
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private Long id;
	private String name;

}
