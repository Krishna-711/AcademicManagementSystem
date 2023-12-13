package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Courses;
import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.repository.CoursesRepository;
import com.klef.jfsd.springboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private CoursesRepository coursesRepository;

	
	@Override
	public Employee checkemplogin(String fid, String pwd) 
	{
		return employeeRepository.checkemplogin(fid, pwd);
	}

	@Override
	public Employee viewemployee(String fid) 
	{
		
		return employeeRepository.viewemployee(fid);
	} 

	@Override
	public int changeemployeepassword(String empoldpwd, String empnewpwd, String fid)
	{
		return employeeRepository.updateemppassword(empnewpwd, empoldpwd, fid);
	}

	@Override
	public List<Courses> viewfacultycourses(String fid) 
	{
		return (List<Courses>) employeeRepository.viewcourses(fid);
	}
	
}
