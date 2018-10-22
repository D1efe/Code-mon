package com.qa.backend.domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "definitions" })

@Component
public class Dictionary {

	//@JsonProperty("definitions")
	//private HashMap<Keyword, Definition> definitions;
	List<GlossaryEntry> definitions;

	private Scanner reader;

	public Dictionary() {

		definitions = new ArrayList<>();
		openFile();
		readFile();
		reader.close();

	}

	//@JsonProperty("definitions")
	public List<GlossaryEntry> getAllDefinitions() {
		return definitions;
	}

	//@JsonProperty("definitions")
	public GlossaryEntry getDefinition(String key) {
		GlossaryEntry result = null;
		for(GlossaryEntry ge: definitions) {
			if(ge.getKeyword().equalsIgnoreCase(key)) {
				result = ge;
			}
		}
		return result;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	private void openFile() {

		try {
			reader = new Scanner(new File("dictionary.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	private void readFile() {

		String key = "";
		String value = "";

		while (reader.hasNext()) {
			key = reader.next();
			value = reader.nextLine();
			definitions.add(new GlossaryEntry(key,value));
		}

	}

}
