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

import com.springboothiber.dto.CourseDTO;
import com.springboothiber.entities.Courses;
import com.springboothiber.service.CourseService;

@RestController
public class CoursesController {

	@Autowired(required=true)
	CourseService cs;
	
	
	@PostMapping("/Course")
	public ResponseEntity<Courses> createCourse(@RequestBody @Valid CourseDTO ctd)
	{
		try
		{
		 Courses c = cs.createCourse(ctd);
		 if(c!=null)
			return new ResponseEntity<Courses>(c,HttpStatus.CREATED);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<Courses>(HttpStatus.BAD_REQUEST);
	}
	
	
	@GetMapping("/Course/{cid}")
	public ResponseEntity<Courses> getStudent(@PathVariable("cid") int cid )
	{
		try
		{
		 Courses c=cs.getCourse(cid);
		 if(c!=null)
			 return new ResponseEntity<Courses>(c,HttpStatus.FOUND);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 return new ResponseEntity<Courses>(HttpStatus.NOT_FOUND);
	}
	
	
	@GetMapping("/Courses")
	public ResponseEntity<List<Courses>> getAllStudents()
	{
		try
		{
		 List<Courses> c=cs.getAllCourse();
		 if(c!=null)
			return new ResponseEntity<List<Courses>>(c,HttpStatus.FOUND);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<List<Courses>>(HttpStatus.NOT_FOUND);
	}
	
	
	@PutMapping("/Course/{cid}")
	public ResponseEntity<Courses>UpdateCourse(@PathVariable("cid") int cid, @Valid CourseDTO ctd)
	{
		try
		{
		 String s=cs.updateCourse(cid, ctd);
		 if(s!=null)
			return new ResponseEntity<Courses>(HttpStatus.ACCEPTED);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<Courses>(HttpStatus.NOT_MODIFIED);		
	}
	
	
	@DeleteMapping("/Course/{cid}")
	public ResponseEntity<String> deleteStudent(@PathVariable("cid") int cid)
	{
		try 
		{
		 String s=cs.deleteCourse(cid);
		 if(s!=null)
			return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);		
	}
	
	@DeleteMapping("/Courses")
	public ResponseEntity<String> deleteAllStudent()
	{
		try
		{
		 String s=cs.deleteAllCourses();
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
