package com.drivingSchoolApp.DrivingSchoolEntities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ClassroomSession {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int classroomSessionID;
	
	@ManyToOne
	@JoinColumn(name="sessionID", nullable=false)
	private Session session;
	
	@ManyToOne
	@JoinColumn(name="courseID", nullable=false)
	private Course course;
	
	@ManyToOne
	@JoinColumn(name="courseInstructorID", nullable=false)
	private CourseInstructor courseInstructor;
    
    public ClassroomSession() {
    	
    }
    
	public ClassroomSession(int classroomSessionID, Session session, Course course, CourseInstructor courseInstructor) {
		super();
		this.classroomSessionID = classroomSessionID;
		this.session = session;
		this.course = course;
		this.courseInstructor = courseInstructor;
	}

	public int getClassroomSessionID() {
		return classroomSessionID;
	}

	public void setClassroomSessionID(int classroomSessionID) {
		this.classroomSessionID = classroomSessionID;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public CourseInstructor getCourseInstructor() {
		return courseInstructor;
	}

	public void setCourseInstructor(CourseInstructor courseInstructor) {
		this.courseInstructor = courseInstructor;
	}

	

}
