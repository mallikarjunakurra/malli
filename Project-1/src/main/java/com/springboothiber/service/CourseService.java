package com.springboothiber.service;

import java.util.List;

import org.springframework.stereotype.Component;
import com.springboothiber.dto.CourseDTO;
import com.springboothiber.entities.Courses;

@Component
public interface CourseService {

	public Courses createCourse(CourseDTO ct);
	public Courses getCourse(int cid);
	public List<Courses> getAllCourse();
	public String updateCourse(int cid,CourseDTO ct);
	public String deleteCourse(int cid);
	public String deleteAllCourses();
}
