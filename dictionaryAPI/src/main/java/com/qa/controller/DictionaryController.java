package com.qa.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.backend.domain.GlossaryEntry;
import com.qa.backend.persistence.IDictionary;

@RequestMapping("/dictionary")
@RestController
public class DictionaryController {
	
	@Autowired
	private IDictionary service;
	
	@RequestMapping("/get-definition/{key}")
	@ResponseBody
	public GlossaryEntry getDefinition(@PathVariable String key) {	
		return service.getDefinition(key);
	}
	
	
	@GetMapping("/get-all-definitions")
	@ResponseBody
	public List<GlossaryEntry> getAllDefinitions() {
		return service.getAllDefinitions();
	}

}