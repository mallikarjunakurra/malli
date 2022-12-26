package com.springboothiber.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboothiber.dto.StudentDTO;
import com.springboothiber.entities.Student;
import com.springboothiber.repositories.StudentRepository;
import com.springboothiber.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository sr;
	
	@Override
	public Student createStudent(StudentDTO st) 
	{
	    Student s= Student.builder()
	    		.sname(st.getSname())
	    		.sage(st.getSage())
	    		.scontact(st.getScontact())
	    		.scourse(st.getScourse()).build();
		return sr.save(s);
	}

	
	@Override
	public Student getStudent(int id) 
	{
		return sr.findById(id).get();
	}

	
	@Override
	public List<Student> getAllStudents() 
	{		
		return sr.findAll();
	}

	
	@Override
	public String updateStudent(int id, StudentDTO st) 
	{
		@SuppressWarnings("unused")
		Student s=sr.findById(id).get();
		Student s1=Student.builder()
				   .sid(id)
				   .sname(st.getSname())
				   .sage(st.getSage())
				   .scontact(st.getScontact())
				   .scourse(st.getScourse())
				   .build();
		sr.save(s1);
		return "Record Updated Successfully";
	}

	
	@Override
	public String deleteStudent(int id) 
	{
		sr.deleteById(id);
		return "Record Deleted Successfully";
	}

	
	@Override
	public String deleteAllStudents() 
	{
	    sr.deleteAll();
		return "All Records are Deleted Successfully";
	}

}
