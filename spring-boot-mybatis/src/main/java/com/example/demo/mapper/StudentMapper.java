package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.bean.Student;
@Mapper
public interface StudentMapper {
	public void add(Student student);
	public void delete(int id);
	public void update(Student student);
	public Student select(int id);

	public List<Student> findbyclassid(int id);
	public Student selectstudentbymap(Map<String,Object>map);
	public void deleteByAddressId(Map<String,Object>map);
}
