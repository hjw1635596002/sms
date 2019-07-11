package com.briup.apps.sms.bean;
/**
 * 查询School表中的name，tel，address这三个属性
 * @author hjw
 *
 */
public class SchoolMessage{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String tel;
	private String address;
}
