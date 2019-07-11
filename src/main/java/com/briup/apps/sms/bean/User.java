package com.briup.apps.sms.bean;

import java.math.BigInteger;

/**
 * 用户信息
 * @author Administrator
 *
 */
public class User {
	private Long id;
	private String realname;
	private String telphone;
	private String password;
	private BigInteger student_no;
	
	private String gender;
	private Long clazz_id;
	public BigInteger getStudent_no() {
		return student_no;
	}
	public void setStudent_no(BigInteger student_no) {
		this.student_no = student_no;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getClazz_id() {
		return clazz_id;
	}
	public void setClazz_id(Long clazz_id) {
		this.clazz_id = clazz_id;
	}
}
