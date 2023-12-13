package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Courses;
import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.repository.AdminRepository;
import com.klef.jfsd.springboot.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public Student checkstudentlogin(String uname, String pwd) 
	{
		return studentRepository.checkstudentlogin(uname, pwd);//checklogin
	}

	@Override
	public Student viewstudent(String uname) 
	{
		return studentRepository.viewstudent(uname);
	}

	@Override
	public List<Courses> viewstudentcourses(String fid) 
	{
		return (List<Courses>) studentRepository.viewcourses(fid);
	}
	

	

}
