package com.dugu.acc.dev.web.api;

public class User {
	int id;
	String name;
	int age;
	String branch;
	String address;

	public User(int id, String name, int age, String branch, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.branch = branch;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age
				+ ", branch=" + branch + ", address=" + address + "]";
	}

}
