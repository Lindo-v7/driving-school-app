package com.drivingSchoolApp.DrivingSchoolEntities;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Session {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sessionID;
	private Date Date;
	private Time time;
	private int duration; // duration in hours
	private String location;
    
    public Session() {
    	
    }
    
	public Session(int sessionID, java.sql.Date date, Time time, int duration, String location) {
		super();
		this.sessionID = sessionID;
		Date = date;
		this.time = time;
		this.duration = duration;
		this.location = location;
	}

	public int getSessionID() {
		return sessionID;
	}

	public void setSessionID(int sessionID) {
		this.sessionID = sessionID;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
