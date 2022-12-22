package com.springboothiber.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboothiber.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
