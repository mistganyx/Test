package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.bean.Student;
@Mapper
public interface StudentMapper {
	public Student add(Student student);
	public void delete(int id);
	public void update(Student student);
	public List<Student> selectByList();
    public List<Student> selectByClass_id(int id);
    public Student selectByNameAndId(Map<String,Object> map);
    public void deleteByAddressId(Map<String,Object> map);
    public Student select(int id);
}
