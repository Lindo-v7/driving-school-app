package com.drivingSchoolApp.DrivingSchoolEntities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Test {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int testID;
	
	@ManyToOne
	@JoinColumn(name="sessionID", nullable=false)
	private Session session;
	
	@ManyToOne
	@JoinColumn(name="studentID", nullable=false)
	private Student student;
	
	@ManyToOne
	@JoinColumn(name="instructorID", nullable=false)
	private Instructor instructor;
	private String type; //Theory/Practical
	private String result;
	
	public Test() {
		
	}

	public Test(int testID, Session session, Student student, Instructor instructor, String type, String result) {
		super();
		this.testID = testID;
		this.session = session;
		this.student = student;
		this.instructor = instructor;
		this.type = type;
		this.result = result;
	}

	public int getTestID() {
		return testID;
	}

	public void setTestID(int testID) {
		this.testID = testID;
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

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
}
