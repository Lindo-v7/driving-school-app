package com.drivingSchoolApp.DrivingSchoolEntities;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseID;
  
    private String courseName;
    private String description;
    private int duration; // Duration in hours
    private BigDecimal fee; // Use BigDecimal for monetary values
    private String prerequisites;
    
    public Course() {
    	
    }
    @Autowired
	public Course(int courseID, String courseName, String description, int duration, BigDecimal fee,
			String prerequisites) {
		this.courseID = courseID;
		this.courseName = courseName;
		this.description = description;
		this.duration = duration;
		this.fee = fee;
		this.prerequisites = prerequisites;
	}
    
    
	public int getCourseID() {
		return courseID;
	}
	public void setCourseId(int courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public BigDecimal getFee() {
		return fee;
	}
	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}
	public String getPrerequisites() {
		return prerequisites;
	}
	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}
    
  }
  