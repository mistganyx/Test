package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.bean.Grade;

@Mapper
public interface GradeMapper {
	
	public void add(Grade grade) ;

	public void delete(int id);
	public void update(Grade grade);
	
	public Grade select(int id);

}
