package com.drivingSchoolApp.DrivingSchoolEntities;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
	@GeneratedValue
    private int studentID;
  
    @Column(unique = true)
    private int userId;
  
    private String name;
    private String contactInformation;
    private String address;
    private LocalDate dateOfBirth;
    private String gender;
    private String licenseInformation;
    
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLicenseInformation() {
		return licenseInformation;
	}
	public void setLicenseInformation(String licenseInformation) {
		this.licenseInformation = licenseInformation;
	}
  
    
  }
  