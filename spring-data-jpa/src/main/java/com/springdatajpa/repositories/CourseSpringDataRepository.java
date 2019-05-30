package com.springdatajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdatajpa.entity.Course;

public interface CourseSpringDataRepository extends JpaRepository<Course, Long> {
	
	
	public Course findByNameLike(String name);

}
