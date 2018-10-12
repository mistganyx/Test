package com.example.demo.bean;

public class Address {
	private String address;
	private int id;
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
	
	public Address(String address, int id) {
		super();
		this.address = address;
		this.id = id;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
