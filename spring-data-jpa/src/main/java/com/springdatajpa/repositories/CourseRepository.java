package com.springdatajpa.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springdatajpa.entity.Course;

@Repository
@Transactional
public class CourseRepository {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@PersistenceContext
	EntityManager entityManager;

	public Course findById(Long id) {
		return entityManager.find(Course.class, id);
	}

}
