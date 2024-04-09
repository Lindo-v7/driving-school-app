package com.drivingSchoolApp.DrivingSchoolEntities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CourseInstructor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseInstructorID;
	
	@ManyToOne
	@JoinColumn(name="courseID", nullable=false)
	private Course course;
	
	@ManyToOne
	@JoinColumn(name="instructorID", nullable=false)
	private Instructor instructor;
    
    public CourseInstructor() {
    	
    }

	public CourseInstructor(int courseInstructorID, Course course, Instructor instructor) {
		super();
		this.courseInstructorID = courseInstructorID;
		this.course = course;
		this.instructor = instructor;
	}

	public int getCourseInstructorID() {
		return courseInstructorID;
	}

	public void setCourseInstructorID(int courseInstructorID) {
		this.courseInstructorID = courseInstructorID;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
    
}
