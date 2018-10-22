package com.qa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.qa.persistence.domain.Question;
import com.qa.persistence.repository.QuestionRepository;

public class QuestionService {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	public List<Question> getAllQuestions() {
		return questionRepository.findAll();
	}
}
