package com.springboothiber.service;

import java.util.List;

import com.springboothiber.dto.CourseDTO;
import com.springboothiber.entities.Course;

public interface CourseService {

	public Course createCourse(CourseDTO st);
	public Course getCourse(int cid);
	public List<Course> getAllCourse();
	public String updateCourse(int cid,CourseDTO st);
	public String deleteCourse(int cid);
	public String deleteAllCourses();
}
