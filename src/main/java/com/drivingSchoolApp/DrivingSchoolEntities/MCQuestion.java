package com.drivingSchoolApp.DrivingSchoolEntities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MCQuestion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int questionID;
	private String questionText;
	private String option;
	private String option2;
	private String option3;
	private String option4;
	private int correctOption;
	
	public MCQuestion() {
		
	}
	
	public MCQuestion(int questionID, String questionText, String option, String option2, String option3, String option4,
			int correctOption) {
		super();
		this.questionID = questionID;
		this.questionText = questionText;
		this.option = option;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.correctOption = correctOption;
	}

	public int getQuestionID() {
		return questionID;
	}

	public void setQuestionI(int questionID) {
		this.questionID = questionID;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public int getCorrectOption() {
		return correctOption;
	}

	public void setCorrectOption(int correctOption) {
		this.correctOption = correctOption;
	}
	
}
