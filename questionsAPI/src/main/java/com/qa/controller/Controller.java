package com.qa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qa.persistence.domain.Question;
import com.qa.service.QuestionService;

@RequestMapping("/question")
public class Controller {
	
	@Autowired
	private QuestionService questionService;
	
	@GetMapping("/getAll")
	public List<Question> getAllQuestions() {
		return questionService.getAllQuestions();
	}
}
