package com.klef.jfsd.springboot.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Courses;
import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.service.AdminService;
import com.klef.jfsd.springboot.service.EmployeeService;
import com.klef.jfsd.springboot.service.StudentService;

@Controller
public class ClientController
{
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public String mainhomedemo()
	{
		return "index";
	}
	@GetMapping("/about")
	public String aboutdemo()
	{
		return "about";
	}

	@GetMapping("/contactus")
	public String contactusdemo()
	{
		return "contactus";
	}
	@GetMapping("/adminlogin")
	public ModelAndView adminlogindemo()
	{
		ModelAndView mv = new ModelAndView("adminlogin");
		
		return mv;
	}
	
	@GetMapping("/facultylogin")
	public ModelAndView employeelogindemo()
	{
		ModelAndView mv = new ModelAndView("facultylogin");
		
		return mv;
	}
	@GetMapping("/studentlogin")
	public ModelAndView studentlogindemo()
	{
		ModelAndView mv = new ModelAndView("studentlogin");
		
		return mv;
	}
	
	@GetMapping("/facultyregistration")
	public ModelAndView employeeregdemo()
	{
		ModelAndView mv = new ModelAndView("facultyregistration", "emp",new Employee());
		return mv;
	}
	
	@GetMapping("/addcourse")
	public ModelAndView addcoursedemo()
	{
		ModelAndView mv = new ModelAndView("addcourse", "course",new Courses());
		return mv;
	}
	
	@GetMapping("/studentregistration")
	public ModelAndView studentregdemo()
	{
		ModelAndView mv = new ModelAndView("studentregistration", "stu",new Student());
		return mv;
	}
	
	@GetMapping("/adminhome")
	public ModelAndView adminhomedemo()
	{
		ModelAndView mv = new ModelAndView("adminhome");
		
		return mv;
	}
	
	@GetMapping("/facultyhome")
	public ModelAndView employeehomedemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView("facultyhome");
		
		HttpSession session = request.getSession();
		
		String eid = (String) session.getAttribute("eid");
		
		mv.addObject("eid", eid);
		
		return mv;
	}
	@GetMapping("/studenthome")
	public ModelAndView studenthomedemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView("studenthome");
		
		HttpSession session = request.getSession();
		
		String suname = (String) session.getAttribute("suname");
		
		mv.addObject("suname", suname);
		
		return mv;
	}
	
	@GetMapping("viewallfaculty")
	public ModelAndView viewallemployeedemo()
	{
		ModelAndView mv=new ModelAndView("viewallfaculty");
		List<Employee> emplist=adminService.viewallemployees();
		mv.addObject("emplist",emplist);
		return mv;
	}
	@GetMapping("Viewallstudents")
	public ModelAndView viewallstudentsdemo()
	{
		ModelAndView mv=new ModelAndView("Viewallstudents");
		List<Student> studlist=adminService.viewallstudents();
		mv.addObject("studlist",studlist);
		return mv;
	}
	
	
	@PostMapping("/checkadminlogin")
	public ModelAndView checkadminlogindemo(HttpServletRequest request)
	{
		ModelAndView mv =  new ModelAndView();
		
		String auname = request.getParameter("auname");
		String apwd = request.getParameter("apwd");
		
		Admin admin = adminService.checkadminlogin(auname, apwd);
		
		if(admin!=null)
		{
			
			HttpSession session = request.getSession();
			
			session.setAttribute("auname", auname);
			
			mv.setViewName("adminhome");
		}
		else
		{
			mv.setViewName("adminlogin");
			mv.addObject("msg", "Login Failed");
		}
		
		
		return mv;
	}
	
	
	
	@PostMapping("/checkemplogin")
	public ModelAndView checkemplogindemo(HttpServletRequest request)
	{
		ModelAndView mv =  new ModelAndView();
		
		String eid = request.getParameter("eid");
		String epwd = request.getParameter("epwd");
		
		Employee emp = employeeService.checkemplogin(eid, epwd);
		
		if(emp!=null)
		{
			HttpSession session = request.getSession();
			
			session.setAttribute("eid", eid);
			
			mv.setViewName("facultyhome");
		}
		else
		{
			mv.setViewName("facultylogin");
			mv.addObject("msg", "Login Failed");
		}
		
		
		return mv;
	}
	
	@PostMapping("/checkstudentlogin")
	public ModelAndView checkstudentlogindemo(HttpServletRequest request)
	{
		ModelAndView mv =  new ModelAndView();
		
		String suname = request.getParameter("suname");
		String spwd = request.getParameter("spwd");
		
		Student student = studentService.checkstudentlogin(suname, spwd);
		
		if(student!=null)
		{
			HttpSession session = request.getSession();
			
			session.setAttribute("suname", suname);
			
			mv.setViewName("studenthome");
		}
		else
		{
			mv.setViewName("studentlogin");
			mv.addObject("msg", "Login Failed");
		}
		
		
		return mv;
	}
	
	
	
	@PostMapping("/addemployee")
	public String addemployeedemo(@ModelAttribute("emp") Employee employee)
	{
		adminService.addemployee(employee);
		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("employeeregistration");
//		mv.addObject("msg", "Employee Registered Successfully");
		
		return "redirect:adminhome";
	}
	
	@PostMapping("/addstudent")
	public String addstudentdemo(@ModelAttribute("stu") Student student)
	{
		adminService.addstudent(student);
		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("studentregistration");
//		mv.addObject("msg", "student Registered Successfully");
		
		return "redirect:adminhome";
	}
	
	@PostMapping("/addcourses")
	public String addcoursedemo(@ModelAttribute("course") Courses courses)
	{
		adminService.addcourse(courses);
		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("studentregistration");
//		mv.addObject("msg", "student Registered Successfully");
		
		return "redirect:adminhome";
	}
	
	
	
	@GetMapping("/viewemp")
	public ModelAndView viewemp(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		
		String eid = (String) session.getAttribute("eid");
		
		Employee emp =  employeeService.viewemployee(eid);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewemployee");
		mv.addObject("emp",emp);
		
		return mv;
	}
	
	@GetMapping("/echangepwd")
	public ModelAndView echangepwd(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		
		String eid = (String) session.getAttribute("eid");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("empchangepwd");
		mv.addObject("eid",eid);
		
		return mv;
	}
	
	@PostMapping("/updateemppwd")
	public ModelAndView updateemppwddemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("empchangepwd");
		
		HttpSession session = request.getSession();
		
		String eid = (String) session.getAttribute("eid");
		
		String eoldpwd = request.getParameter("eopwd");
		String enewpwd = request.getParameter("enpwd");
		
		int n = employeeService.changeemployeepassword(eoldpwd, enewpwd, eid);
		
		if(n > 0)
		{
			
			mv.addObject("msg","Password Updated Successfully");
		}
		else
		{
			mv.addObject("msg","Old Password is Incorrect");
		}
		
		return mv;
	}
	
	@GetMapping("/deleteemp")
	public String deleteempdemo(@RequestParam("id") int eid)
	{
		adminService.deleteemployee(eid);
		
		return "redirect:viewallfaculty";
	}
	
	@GetMapping("/deletestud")
	public String deletestudemo(@RequestParam("id") int sid)
	{
		adminService.deletestudent(sid);
		
		return "redirect:Viewallstudents";
	}
	
	@GetMapping("/viewempbyid")
	public ModelAndView viewempbyiddemo(@RequestParam("id") int eid)
	{
		Employee emp = adminService.viewemployeebyid(eid);
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("viewempbyid");
		mv.addObject("emp",emp);
		
		return mv;
	}
	
	
	@GetMapping("/viewstudbyid")
	public ModelAndView viewstudbyiddemo(@RequestParam("id") int sid)
	{
		Student stud = adminService.viewstudentbyid(sid);
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("viewstudbyid");
		mv.addObject("stud",stud);
		
		return mv;
	}
	
	@GetMapping("/viewfacultycourses")
	public ModelAndView viewfacultycoursesdemo(HttpServletRequest request) 
	{
		HttpSession session = request.getSession();
		
		String eid = (String) session.getAttribute("eid");
		System.out.println(eid);
		List<Courses> courselist =  employeeService.viewfacultycourses(eid);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewfacultycourses");
		mv.addObject("courselist",courselist);
		
		return mv;
	}
//	@GetMapping("/viewstudentcourses")
//	public ModelAndView viewstudentcoursesdemo(HttpServletRequest request) 
//	{
//		HttpSession session = request.getSession();
//		
//		String eid = (String) session.getAttribute("eid");
//		System.out.println(eid);
//		List<Courses> courselist =  studentm   Service.viewfacultycourses(eid);
//		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("viewfacultycourses");
//		mv.addObject("courselist",courselist);
//		
//		return mv;
//	}
	
	
}
