package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService 
{
	public int saveStudent(Student student);
	
	public Student getOneStudent(int rollNo);
	
	public List<Student> getAllStudent();
	
	public boolean isStudentExist(int rollNo);
	
	public void deleteStudent(int rollNo);
	
	public Student updateStudent(Student student);
	

}
