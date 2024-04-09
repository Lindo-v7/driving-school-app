package com.drivingSchoolApp.DrivingSchoolEntities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Schedule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int scheduleID;
	private String eventType; //Classroom Session, Driving Session, Test
	private int eventID;
	
	public Schedule() {
		
	}
	
	public Schedule(int scheduleID, String eventType, int eventID) {
		super();
		this.scheduleID = scheduleID;
		this.eventType = eventType;
		this.eventID = eventID;
	}

	public int getScheduleID() {
		return scheduleID;
	}

	public void setScheduleID(int scheduleID) {
		this.scheduleID = scheduleID;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public int getEventID() {
		return eventID;
	}

	public void setEventID(int eventID) {
		this.eventID = eventID;
	}
	
	
	

}
