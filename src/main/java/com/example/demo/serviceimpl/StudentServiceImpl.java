package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService 
{
	@Autowired
	StudentDao studentDao;

	@Override
	public int saveStudent(Student student) {
	
		return studentDao.save(student).getRollNo();
	}

	@Override
	public Student getOneStudent(int rollNo) {
	
		Student s = studentDao.getOneStudent(rollNo);
		return s;
	}

	@Override
	public List<Student> getAllStudent() {
		return studentDao.getAllStudent();
	}

	@Override
	public boolean isStudentExist(int rollNo) {
	    boolean value = studentDao.existsById(rollNo);
		return value;
	}

	@Override
	public void deleteStudent(int rollNo) {
		studentDao.deleteStudentByRollNo(rollNo);
	}

	@Override
	public Student updateStudent(Student student) {
	
		Student st = studentDao.updateStudent(student);
		return st;
	}
	

}
