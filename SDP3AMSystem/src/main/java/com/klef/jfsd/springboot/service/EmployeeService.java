package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Courses;
import com.klef.jfsd.springboot.model.Employee;

public interface EmployeeService
{
	
	public Employee checkemplogin(String fid,String pwd);
	public Employee viewemployee(String fid);
	public List<Courses> viewfacultycourses(String fid);
	public int changeemployeepassword(String empoldpwd,String empnewpwd,String funame);
}
