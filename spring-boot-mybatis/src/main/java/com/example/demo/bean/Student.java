package com.example.demo.bean;

public class Student {
	private String name;
	private int age;
	private int id;
	private Address address;
	private Grade grade;
	private int addressId;
	private int gradeId;

	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", id=" + id + ", address=" + address + ", grade=" + grade
				+ ", addressId=" + addressId + ", gradeId=" + gradeId + "]";
	}
	
	public Student(String name, int age, int id, Address address, Grade grade, int addressId, int gradeId) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.address = address;
		this.grade = grade;
		this.addressId = addressId;
		this.gradeId = gradeId;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
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

	
	
	
	

}
