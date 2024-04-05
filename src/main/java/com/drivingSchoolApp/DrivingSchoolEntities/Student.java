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
    private int studentId;
  
    @Column(unique = true)
    private int userId;
  
    private String name;
    private String contactInformation;
    private String address;
    private LocalDate dateOfBirth;
    private String gender;
    private String licenseInformation;
  
    // Getters and Setters omitted for brevity
  
    // Add constructors and other methods as needed
  }
  