package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Courses;
import com.klef.jfsd.springboot.model.Employee;

@Repository
public interface CoursesRepository extends CrudRepository<Courses,String>

{

	
	
}
