package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Courses;
import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.model.Student;

public interface AdminService
{
	public Admin checkadminlogin(String uname,String pwd);
	
	public void deleteemployee(int id);
	public void deletestudent(int id);
	public List<Employee> viewallemployees();
	public Employee viewemployeebyid(int id);
	public Student viewstudentbyid(int sid);
	public Employee addemployee(Employee employee);
	public Courses addcourse(Courses courses);
	public Student addstudent(Student student);
	public List<Student> viewallstudents();
	
	 
}
