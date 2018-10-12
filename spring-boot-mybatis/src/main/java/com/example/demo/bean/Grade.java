package com.example.demo.bean;

import java.util.List;

public class Grade {
	   private String grade;
	   private int id;
	   private List<Student> students;
   public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}

   @Override
public String toString() {
	return "Grade [grade=" + grade + ", id=" + id + ", students=" + students + "]";
}
	   public Grade(String grade, int id, List<Student> students) {
	super();
	this.grade = grade;
	this.id = id;
	this.students = students;
}
			
			   public Grade() {
				super();
				// TODO Auto-generated constructor stub
			}
			

	
}
