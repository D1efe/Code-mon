package com.qa.backend.persistence;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.backend.domain.Dictionary;
import com.qa.backend.domain.GlossaryEntry;
import com.qa.backend.utility.JSONUtility;

@Service
public class DictionaryService implements IDictionary {

	@Autowired
	private Dictionary dictionary;


	@Override
	public GlossaryEntry getDefinition(String key) {
		return dictionary.getDefinition(key);
	}

	@Override
	public List<GlossaryEntry> getAllDefinitions() {
		return dictionary.getAllDefinitions();
	}



}
