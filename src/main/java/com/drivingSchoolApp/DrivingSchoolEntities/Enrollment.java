package com.drivingSchoolApp.DrivingSchoolEntities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Enrollment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int enrollmentID;

  @ManyToOne
  @JoinColumn(name="studentID", nullable=false)
  private Student student;

  @ManyToOne
  @JoinColumn(name="courseID", nullable=false)
  private Course course;

  private String enrollmentStatus;

  public Enrollment() {
	  
  }

  public Enrollment(int enrollmentID, Student student, Course course, String enrollmentStatus) {
	super();
	this.enrollmentID = enrollmentID;
	this.student = student;
	this.course = course;
	this.enrollmentStatus = enrollmentStatus;
  }

  public int getEnrollmentID() {
	return enrollmentID;
  }

  public void setEnrollmentID(int enrollmentID) {
	this.enrollmentID = enrollmentID;
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

