package com.drivingSchoolApp.DrivingSchoolEntities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class UserAccount {

	@Id
  	@GeneratedValue(strategy = GenerationType.IDENTITY)
  	private int userID;

  	@Column(unique = true)
  	
  	private String username;

  	private String password; // Consider using a secure password hashing mechanism

  	public UserAccount(int userId, String username, String password, Role role) {
	super();
	this.userID = userId;
	this.username = username;
	this.password = password;
	this.role = role;
	}
	
	@ManyToOne
	private Role role;
		
	public int getUserId() {
		return userID;
	}
	
	public void setUserId(int userId) {
		this.userID = userId;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Role getRole() {
		return role;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}


}
