package com.drivingSchoolApp.DrivingSchoolEntities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class TestScore {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int testScoreID;
	
	@ManyToOne
	@JoinColumn(name="testID", nullable=false)
	private Test test;
	
    private double score;
    private Date dateTaken;
    
    public TestScore() {
    	
    }

	public TestScore(int testScoreID, Test test, double score, Date dateTaken) {
		super();
		this.testScoreID = testScoreID;
		this.test = test;
		this.score = score;
		this.dateTaken = dateTaken;
	}

	public int getTestScoreID() {
		return testScoreID;
	}

	public void setTestScoreID(int testScoreID) {
		this.testScoreID = testScoreID;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public Date getDateTaken() {
		return dateTaken;
	}

	public void setDateTaken(Date dateTaken) {
		this.dateTaken = dateTaken;
	}
    
}
