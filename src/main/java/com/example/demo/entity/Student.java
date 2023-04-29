package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student 
{
	@Column(name = "roll_no", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollNo;
	
	@Column(name = "student_name",nullable = false)
	private String name;
	
	@Column(name = "student_address",nullable = false)
	private String address;
	
	@Column(name = "email_id",nullable = false)
	private String emailId;
	
	public Student() {
		
	}
	public Student(int rollNo, String name, String address,String emailId) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.emailId = emailId;
		
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAddress() {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setEmailId() {
		this.emailId = emailId;
	}
	public String getEmailId() {
		return emailId;
	}

	public String toString() {
		return "Student[ rollNo ="+ rollNo + ", name ="+ name + ", address =" + address + ", emailId =" + emailId + "]";
	}
}
