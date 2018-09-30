package com.boot.myspringboot.model;

public class Topics {
	private String name;
	private String desc;
	
	public Topics() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Topics(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
