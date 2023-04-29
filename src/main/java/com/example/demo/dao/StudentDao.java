package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface StudentDao extends JpaRepository<Student,Integer>
{
   @Query(value = "SELECT stud from Student stud WHERE rollNo = :rollNo")
   public Student getOneStudent(@Param("rollNo") int rollNo);
   
   @Query(value = "SELECT * FROM Student")
   public List<Student> getAllStudent();
   
   @Query(value = "DELETE stud FROM Student stud WHERE rollNo = :rollNo")
   @Modifying
   public void deleteStudentByRollNo(@Param("rollNo") int rollNo);
   
   @Query(value = "UPDATE Student stud SET name= :name, emailId = :emailId , address = :address WHERE rollNo = :rollNo")
//   @Query(value = "UPDATE Student SET Student = :Student WHERE rollNo = :rollNo")
   @Modifying
   public Student updateStudent(@Param("Student") Student student);
}
