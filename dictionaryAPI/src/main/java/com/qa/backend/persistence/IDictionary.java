package com.qa.backend.persistence;

import java.util.HashMap;
import java.util.List;

import com.qa.backend.domain.GlossaryEntry;


public interface IDictionary {

	GlossaryEntry getDefinition(String key);

	List<GlossaryEntry> getAllDefinitions();

}
