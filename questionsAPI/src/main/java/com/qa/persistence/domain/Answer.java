package com.qa.persistence.domain;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.*;

@Entity
public class Answer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String answer;
	private boolean correct;
	
	public Answer (String answer, boolean correct) {	
		this.answer = answer;
		this.correct = correct;	
	}
	
	public Answer() {
		
	}
	
	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
	
	public boolean isCorrect() {
		return correct;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	
	
	

}
