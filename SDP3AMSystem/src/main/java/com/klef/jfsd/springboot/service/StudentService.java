package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Courses;
import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.model.Student;

public interface StudentService
{
	
	public Student checkstudentlogin(String uname,String pwd);
	public Student viewstudent(String uname);
	public List<Courses> viewstudentcourses(String fid) ;

	//public int changeemployeepassword(String empoldpwd,String empnewpwd,String euname);
}
