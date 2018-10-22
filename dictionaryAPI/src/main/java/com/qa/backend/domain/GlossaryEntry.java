package com.qa.backend.domain;

public class GlossaryEntry {
	private String keyword;
	private String definition;

	public GlossaryEntry(String keyword, String definition) {
		this.keyword = keyword;
		this.definition = definition;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}
}
