package com.springboothiber.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboothiber.dto.CourseDTO;
import com.springboothiber.entities.Courses;
import com.springboothiber.repositories.CourseRepository;
import com.springboothiber.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	CourseRepository cr;
	
	@Override
	public Courses createCourse(CourseDTO ct) 
	{
		Courses c=Courses.builder()
				 .cname(ct.getCname())
				 .build();
		return cr.save(c);
	}

	
	@Override
	public Courses getCourse(int cid) 
	{
		return cr.findById(cid).get();
	}

	
	@Override
	public List<Courses> getAllCourse() 
	{	
		return cr.findAll();
	}

	
	@Override
	public String updateCourse(int cid, CourseDTO ct) 
	{
		Courses c=cr.findById(cid).get();
		/* c=Courses.builder()
				  .cid(cid)
				  .cname(ct.getCname())
				  .build();*/
		c.setCname(ct.getCname());
		cr.save(c);
		return "Record Updated Successfully...";
	}

	
	@Override
	public String deleteCourse(int cid) 
	{
		cr.deleteById(cid);
		return "Record Deleted Successfully...";
	}

	
	@Override
	public String deleteAllCourses() 
	{
		cr.deleteAll();
		return "AllRecords are Deleted Successfully...";
	}

}
