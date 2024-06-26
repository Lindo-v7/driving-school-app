package com.drivingSchoolApp.DrivingSchoolEntities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Role {

	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int roleId;

	  @Column(unique = true)
	  private String roleName;
}
