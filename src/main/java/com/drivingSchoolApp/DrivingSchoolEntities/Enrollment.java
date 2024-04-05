package com.drivingSchoolApp.DrivingSchoolEntities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Enrollment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int enrollmentId;

  @ManyToOne
  private Student student;

  @ManyToOne
  private Course course;

  private String enrollmentStatus;
  
  

	public Enrollment(int enrollmentId, Student student, Course course, String enrollmentStatus) {
	super();
	this.enrollmentId = enrollmentId;
	this.student = student;
	this.course = course;
	this.enrollmentStatus = enrollmentStatus;
}

	public int getEnrollmentId() {
		return enrollmentId;
	}
	
	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}
	
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Course getCourse() {
		return course;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public String getEnrollmentStatus() {
		return enrollmentStatus;
	}
	
	public void setEnrollmentStatus(String enrollmentStatus) {
		this.enrollmentStatus = enrollmentStatus;
	}

  
}

