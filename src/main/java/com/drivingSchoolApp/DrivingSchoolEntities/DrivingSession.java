package com.drivingSchoolApp.DrivingSchoolEntities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DrivingSession {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int drivingSessionID;
	
	@ManyToOne
	@JoinColumn(name="sessionID", nullable=false)
	private Session session;
	
	@ManyToOne
	@JoinColumn(name="studentID", nullable=false)
	private Student student;
	
	@ManyToOne
	@JoinColumn(name="courseInstructorID", nullable=false)
	private CourseInstructor courseInstructor;
	
	private String vehicleReg;
	
	public DrivingSession() {
		
	}

	public DrivingSession(int drivingSessionID, Session session, Student student, CourseInstructor courseInstructor,
			String vehicleReg) {
		super();
		this.drivingSessionID = drivingSessionID;
		this.session = session;
		this.student = student;
		this.courseInstructor = courseInstructor;
		this.vehicleReg = vehicleReg;
	}

	public int getDrivingSessionID() {
		return drivingSessionID;
	}

	public void setDrivingSessionID(int drivingSessionID) {
		this.drivingSessionID = drivingSessionID;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public CourseInstructor getCourseInstructor() {
		return courseInstructor;
	}

	public void setCourseInstructor(CourseInstructor courseInstructor) {
		this.courseInstructor = courseInstructor;
	}

	public String getVehicleReg() {
		return vehicleReg;
	}

	public void setVehicleReg(String vehicleReg) {
		this.vehicleReg = vehicleReg;
	}
	
}
