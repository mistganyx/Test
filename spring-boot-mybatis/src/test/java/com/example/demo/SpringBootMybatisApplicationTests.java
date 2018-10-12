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

public class SpringBootMybatisApplicationTests {
	@Autowired
	AddressMapper addressMapper;
	
	@Autowired
	GradeMapper gradeMapper;
	@Autowired
	StudentMapper studentMapper;
	
	@Test
	public void contextLoads() {
		//this.addStudent();
		//this.deleteGrade();
		//this.deleteAddress();
		//this.addGrade();
		//this.updateGrade();
		//this.addAddress();
		//this.updateAddress();
		//this.selectGrade();
		//this.selectAddress();
		//this.addStudent();
		//this.deleteStudent();
		//this.updateStudent();
		//this.selectStudent();
		//this.selectByMap();
		//this.deleteByAddressId();
		//this.deleteByAddress();

	}
   void addGrade(){
	   Grade grade = new Grade();
	   grade.setId(3);
	   grade.setGrade("三班");
	   gradeMapper.add(grade);
   }
   void deleteGrade(){
	   
	   gradeMapper.delete(3);
	   
   }
   void updateGrade(){
	   Grade grade = new Grade();
	   grade.setId(3);
	   grade.setGrade("第三班");
	   gradeMapper.update(grade);
   }
   void selectGrade(){
	   Grade grade=
	   gradeMapper.select(1);
	   System.out.println(grade);
	   
   }
   void addAddress(){
	   Address address = new Address();
	   address.setId(3);
	   address.setAddress("广州");
	   addressMapper.add(address);
   }
   void deleteAddress(){
	   addressMapper.delete(4);
   }
   void updateAddress(){
	   Address address = new Address();
	   address.setId(4);
	   address.setAddress("昆山");
	   addressMapper.update(address);
   }
   void selectAddress(){
	   Address address=
	   addressMapper.select(1);
	   System.out.println(address);
   }
   void addStudent(){
	   Student student = new Student();
	   student.setId(4);
	   student.setName("赵六");
	   student.setAge(22);
	   student.setAddressId(4);
	   student.setGradeId(3);
	   studentMapper.add(student);
   }
   void deleteStudent(){
	   studentMapper.delete(4);
   }
   
   void updateStudent(){
	   Student student = new Student();
	   student.setId(4);
	   student.setName("你好");
	   student.setAge(22);
	   student.setAddressId(4);
	   student.setGradeId(3);
	   studentMapper.update(student);
   }
   void selectStudent(){
	   Student student=
	   studentMapper.select(1);
	   System.out.println(student);
   }
   void selectByMap(){
	   Map<String,Object> map=new HashMap<>();
	   map.put("name","张三");
	   map.put("id", 1);
	   Student s =(Student) studentMapper.selectByNameAndId(map);
	   System.out.println(s);
			   
   }
   void deleteByAddressId(){
	   Map<String,Object> map=new HashMap<>();
	   List<Integer> list=new ArrayList<>();
	    list.add(1);
	    map.put("addressId", list);
	  studentMapper.deleteByAddressId(map);
   }
   void deleteByAddress(){
	   Map<String,Object> map=new HashMap<>();
	   List<Integer> list=new ArrayList<>();
	    list.add(6);
	    map.put("addressId", list);
	    addressMapper.deleteById(map);
   }
 
}

