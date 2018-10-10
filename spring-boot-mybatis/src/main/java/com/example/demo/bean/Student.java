package com.example.demo.bean;

public class Student {
	private int id;
	private String name;
	private int age;
	private Address address;
	private int addressId;
	private int gradeId;
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getGradeId() {
		return gradeId;
	}
	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}
	
	

	@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", addressId=" + addressId
			+ ", gradeId=" + gradeId + "]";
}
	public Student(int id, String name, int age, Address address, int addressId, int gradeId) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.address = address;
	this.addressId = addressId;
	this.gradeId = gradeId;
}

	public Student() {
	super();
	// TODO Auto-generated constructor stub
}
	
}
