package com.drivingSchoolApp.DrivingSchoolEntities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Instructor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int InstructorID;
    private String name;
    private String contactInformation;
    private Date hireDate;
    
    public Instructor() {
    	
    }
    
	public Instructor(int instructorID, String name, String contactInformation, Date hireDate) {
		super();
		InstructorID = instructorID;
		this.name = name;
		this.contactInformation = contactInformation;
		this.hireDate = hireDate;
	}

	public int getInstructorID() {
		return InstructorID;
	}

	public void setInstructorID(int instructorID) {
		InstructorID = instructorID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
    
	
}
