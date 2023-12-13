package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Courses;
import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.repository.AdminRepository;
import com.klef.jfsd.springboot.repository.CoursesRepository;
import com.klef.jfsd.springboot.repository.EmployeeRepository;
import com.klef.jfsd.springboot.repository.StudentRepository;

@Service
public class AdminServiceImpl implements AdminService
{
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private CoursesRepository coursesRepository;
	
	
	@Override
	public Employee addemployee(Employee employee)
	{
		return employeeRepository.save(employee);
		
	}
	@Override
	public Courses addcourse(Courses courses) 
	{
		return coursesRepository.save(courses);
		
	}
	
	@Override
	public Admin checkadminlogin(String uname, String pwd) 
	{
		return adminRepository.checkadnminlogin(uname, pwd);//checklogin
	}

	

	@Override
	public void deleteemployee(int id)
	{
		employeeRepository.deleteById(id);
		
	}
	@Override
	public void deletestudent(int id)
	{
		studentRepository.deleteById(id);
		
	}


	@Override
	public Student addstudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Employee> viewallemployees() {
		
		return (List<Employee>)employeeRepository.findAll();
	}
	
	@Override
	public List<Student> viewallstudents() {
		
		return (List<Student>)studentRepository.findAll();
	}
	@Override
	public Employee viewemployeebyid(int id) {
		return employeeRepository.findById(id).get();
	}
	@Override
	public Student viewstudentbyid(int sid) {
		return studentRepository.findById(sid).get();
	}

	

}
