package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.bean.Address;
import com.example.demo.bean.Student;
import com.example.demo.mapper.AddressMapper;
import com.example.demo.mapper.GradeMapper;
import com.example.demo.mapper.StudentMapper;



@Controller
public class StudentController {
	
	
	@Autowired
   StudentMapper studentMapper;
	@Autowired
	AddressMapper addressMapper;
	@Autowired
	GradeMapper gradeMapper;
	
	@RequestMapping(value="getStudent")
	public ModelAndView getStudent(HttpServletRequest request,HttpServletResponse response){
	ModelAndView mv=new ModelAndView();
	List<Student> list=studentMapper.selectByList();
	System.out.println(list);
	System.out.println(list.get(1));
	mv.addObject("students",list);
	mv.setViewName("student");
		return mv;
		
	}


	@RequestMapping(value="delete")
	public ModelAndView deleteStudent(HttpServletRequest request,HttpServletResponse response){
		int id1=Integer.valueOf(request.getParameter("id"));
		studentMapper.delete(id1);
		return new ModelAndView("redirect:/getStudent");
	}
	



}
