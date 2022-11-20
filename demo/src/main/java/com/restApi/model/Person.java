package com.restApi.model;

public class Person {
	
	private int pid;
	private String name;
	private String age;
	
	
	public Person() {
		super();
		
	}
	public Person(int pid, String name, String age) {
		super();
		this.pid = pid;
		this.name = name;
		this.age = age;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
