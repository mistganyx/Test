package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.bean.Address;
@Mapper
public interface AddressMapper {
	public  void add(Address address);
	public Address findById(int id);
	public void delete(int id);
	public void update(Address address);
	public void select(int id);
}
