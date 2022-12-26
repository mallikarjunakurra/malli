package com.springboothiber.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springboothiber.dto.StudentDTO;
import com.springboothiber.entities.Student;

@Component
public interface StudentService {

	public Student createStudent(StudentDTO st);
	public Student getStudent(int id);
	public List<Student> getAllStudents();
	public String updateStudent(int id,StudentDTO st);
	public String deleteStudent(int id);
	public String deleteAllStudents();
}
