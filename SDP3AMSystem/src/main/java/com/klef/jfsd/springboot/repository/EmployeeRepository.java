package com.klef.jfsd.springboot.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Courses;
import com.klef.jfsd.springboot.model.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{
	@Query("select e from Employee e where facultyid=?1 and password=?2")
	public Employee checkemplogin(String fid,String pwd);
	
	@Query("select e from Employee e where facultyid=?1")
	public Employee viewemployee(String fid);
	
	@Query("select c from Courses c where faculty_id=?1")
	public List<Courses> viewcourses(String fid);
	
	@Transactional
	@Modifying
	@Query("update Employee e set e.password=?1 where e.password=?2 and e.facultyid=?3")
	public int updateemppassword(String empnewpwd,String empoldpwd,String fid);

}
