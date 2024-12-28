package com.SpringBootExample;

public class TextEditor {
	private SpellChecker spellchecker;
	private String name;
	
	public TextEditor(SpellChecker spellchecker, String name) {
		
		this.spellchecker = spellchecker;
		this.name = name;
	}
	public SpellChecker getSpellchecker() {
		return spellchecker;
	}
	public void setSpellchecker(SpellChecker spellchecker) {
		this.spellchecker = spellchecker;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void run()
	{
		spellchecker.checkSpelling();
	}
}
