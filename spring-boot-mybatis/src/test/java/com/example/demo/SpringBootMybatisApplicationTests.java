package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.bean.Address;
import com.example.demo.bean.Grade;
import com.example.demo.bean.Student;
import com.example.demo.mapper.AddressMapper;
import com.example.demo.mapper.GradeMapper;
import com.example.demo.mapper.StudentMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback(false)
public class SpringBootMybatisApplicationTests {

	@Autowired
	GradeMapper gradeMapper;
	@Autowired
	AddressMapper addressMapper;
	@Autowired
	StudentMapper studentMapper;
	@Test
	public void contextLoads() {
		//this.addGrade();
		//this.deleteGrade();
		//this.updateGrade();
		//this.selectGrade();
		
		//this.addAddress();
		//this.deleteAddress();
		//this.selectAddress();
		//this.updateAddress();
		
		
		//this.addStudent();
		//this.deleteStudent();
		//this.updateStudent();
		//this.selectStudent();
		
		
		//this.selectByMap();
		this.deleteByAddressId();
	}
   void addGrade(){
	   Grade grade = new Grade();
	   grade.setId(7);
	   grade.setName("2");
	   gradeMapper.add(grade);
   }
   void deleteGrade(){
	  gradeMapper.delete(3);
   }
   
   void updateGrade(){
	   Grade grade = new Grade();
	   grade.setId(1);
	   grade.setName("3333");
	   gradeMapper.update(grade);
   }
 
   void selectGrade(){
	   Grade grade =
	   gradeMapper.select(1);
	   System.out.println(grade);
   }
   
   
   
   
   void addAddress(){
	   Address address = new Address();
	   address.setId(7);
	   address.setAddress("lala");
	   addressMapper.add(address);
   }
   
   void deleteAddress(){
		  addressMapper.delete(1);
	   }
   void updateAddress(){
	   Address address = new Address();
	   address.setId(3);
	   address.setAddress("昆山");
	   addressMapper.update(address);
   }
   void selectAddress(){
	   addressMapper.select(3);
   }
   
   
   void addStudent(){
	   Student student = new Student();
	   student.setId(7);
	   student.setName("yyx");
	   student.setAge(22);
	   student.setAddressId(3);
	   student.setGradeId(2);
	   studentMapper.add(student);
   }
   void deleteStudent(){
	   studentMapper.delete(4);
   }
   void updateStudent(){
	   Student student = new Student();
	   student.setId(1);
	   student.setName("你好");
	   student.setAge(22);
	   student.setAddressId(4);
	   student.setGradeId(3);
	   studentMapper.update(student);
   }
   void selectStudent(){
	   Student stu =
	   studentMapper.select(1);
	   System.out.println(stu);
   }
   void selectByMap(){
	   Map<String,Object>map =new HashMap<>();
	   map.put("name", "cy");
	   map.put("id", "1");
	   Student s =studentMapper.selectstudentbymap(map);
	   System.out.println(s);
   }
   void deleteByAddressId(){
	   Map<String,Object>map =new HashMap<>();
	   List<Integer>list = new ArrayList<>();
	   list.add(3);
	   map.put("addressId", list);
	   studentMapper.deleteByAddressId(map);
   }
   
}