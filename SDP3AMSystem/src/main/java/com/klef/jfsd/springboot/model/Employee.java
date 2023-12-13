package com.klef.jfsd.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "faculty_table")
public class Employee 
{
  @Id
  @GeneratedValue(strategy=GenerationType.SEQUENCE)
  private int id;
  @Column(nullable = false,length = 200)
   private String facultyid;
  @Column(nullable = false,length = 200)
   private String name;
  @Column(nullable = false,length = 10)
   private String gender;
  @Column(nullable = false,length = 10)
  private String dateofbirth;
  @Column(nullable = false,length = 200)
  private String department;
  @Column(nullable = false,precision = 10,scale = 4)
   private double salary;
  @Column(nullable = false,length = 200)
   private String location;
  @Column(nullable = false,unique = true,length = 200)
  private String emailid;
  @Column(nullable = false,unique = true,length = 200)
   private String password;
  @Column(nullable = false,length = 200)
  private String contactno;
  

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFacultyid() {
	return facultyid;
}
public void setFacultyid(String facultyid) {
	this.facultyid = facultyid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDateofbirth() {
	return dateofbirth;
}
public void setDateofbirth(String dateofbirth) {
	this.dateofbirth = dateofbirth;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getContactno() {
	return contactno;
}
public void setContactno(String contactno) {
	this.contactno = contactno;
}
@Override
public String toString() {
	return "Employee [facultyid=" + facultyid + ", name=" + name + ", gender=" + gender + ", dateofbirth=" + dateofbirth
			+ ", department=" + department + ", salary=" + salary + ", location=" + location + ", emailid=" + emailid
			+ ", password=" + password + ", contactno=" + contactno + "]";
}
   

}
