package com.jdbc.Lab_Test_on_Spring.Dao;

import java.util.List;

import com.jdbc.Lab_Test_on_Spring.Entities.Student;

public interface StudentDao {

	public int insertStudent(Student std);

	public int updateStudent(Student std);

	public int deleteStudent(Student std);

	public Student getStudent(int std);

	public List<Student> getAllStudents();
}
