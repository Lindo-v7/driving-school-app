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

  //@ManyToOne
  //private Course course;

  private String enrollmentStatus;

  // Getters and Setters omitted for brevity

  // Add constructors and other methods as needed
}
