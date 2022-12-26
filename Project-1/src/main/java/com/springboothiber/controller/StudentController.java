package com.springboothiber.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboothiber.dto.StudentDTO;
import com.springboothiber.entities.Student;
import com.springboothiber.service.StudentService;

@RestController
public class StudentController {

	@Autowired(required=true)
	StudentService ss;

	
	@PostMapping("/Student")
	public ResponseEntity<Student> createStudent(@RequestBody @Valid StudentDTO std)
	{
		try
		{
		 Student s = ss.createStudent(std);
		 if(s!=null)
			return new ResponseEntity<Student>(s,HttpStatus.CREATED);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<Student>(HttpStatus.BAD_REQUEST);
	}
	
	
	@GetMapping("/Student/{sid}")
	public ResponseEntity<Student> getStudent(@PathVariable("sid") int sid )
	{
		 try
		 {
		  Student s=ss.getStudent(sid);
		  if(s!=null)
			 return new ResponseEntity<Student>(s,HttpStatus.FOUND);
		 }
		 catch(Exception e)
		 {
			e.printStackTrace();
		 }
		 return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	}
	
	
	@GetMapping("/Students")
	public ResponseEntity<List<Student>> getAllStudents()
	{
		try
		{
		 List<Student> s=ss.getAllStudents();
		 if(s!=null)
			return new ResponseEntity<List<Student>>(s,HttpStatus.FOUND);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<List<Student>>(HttpStatus.NOT_FOUND);
	}
	
	
	@PutMapping("/Student/{sid}")
	public ResponseEntity<Student>UpdateStudent(@PathVariable("sid") int sid, @Valid StudentDTO st)
	{
		try
		{
		 String s=ss.updateStudent(sid, st);
		 if(s!=null)
			return new ResponseEntity<Student>(HttpStatus.ACCEPTED);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<Student>(HttpStatus.NOT_MODIFIED);		
	}
	
	
	@DeleteMapping("/Student/{sid}")
	public ResponseEntity<String> deleteStudent(@PathVariable("sid") int sid)
	{
		try
		{
		 String s=ss.deleteStudent(sid);
		 if(s!=null)
			return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);		
	}
	
	
	@DeleteMapping("/Students")
	public ResponseEntity<String> deleteAllStudent()
	{
		try
		{
		 String s=ss.deleteAllStudents();
		 if(s!=null)
			return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);		
	}
}

