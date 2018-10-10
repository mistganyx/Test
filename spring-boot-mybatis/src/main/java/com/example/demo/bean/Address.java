package com.example.demo.bean;

import java.util.List;

public class Address {
	private int id;
	private String address;
	private List<Student> students;
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int id, String address) {
		super();
		this.id = id;
		this.address = address;
	}
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Address [id=" + id + ", address=" + address + "]";
	}
	
	
	
	

	

}
