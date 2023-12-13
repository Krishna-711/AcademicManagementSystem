package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.model.Student;

@Repository
public interface AdminRepository extends CrudRepository<Admin,String>
{
	@Query("select a from Admin a where username=?1 and password=?2")
	public Admin checkadnminlogin(String uname,String pwd);
	
	@Query("select e from Employee e where facultyid=?1")
	public Employee viewemployee(String fid);
	
	@Query("select s from Student s where username=?1")
	public Student viewstudent(String suname);
	
}
