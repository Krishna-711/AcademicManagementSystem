package com.klef.jfsd.springboot.model;

import javax.persistence.*;

@Entity
@Table(name = "courses_table")
public class Courses 
{
	  @Id
	  @GeneratedValue
	   private int id;
	  @Column(nullable = false,length = 200)
	   private String name;
	  @Column(nullable = false,length = 10)
	   private String code;
	  @Column(nullable = false,length = 10)
	  private String ltps;
	  @Column(nullable = false,length = 200)
	  private String credits;
	  @Column(nullable = false,length = 200)
	   private String year;
	  @Column(nullable = false)
	   private int sem;
	  @Column(nullable = false,length = 200)
	   private String faculty_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLtps() {
		return ltps;
	}
	public void setLtps(String ltps) {
		this.ltps = ltps;
	}
	public String getCredits() {
		return credits;
	}
	public void setCredits(String credits) {
		this.credits = credits;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public String getFaculty_id() {
		return faculty_id;
	}
	public void setFaculty_id(String faculty_id) {
		this.faculty_id = faculty_id;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", name=" + name + ", code=" + code + ", ltps=" + ltps + ", credits=" + credits
				+ ", year=" + year + ", sem=" + sem + ", faculty_id=" + faculty_id + "]";
	}
	  

}
