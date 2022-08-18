package com.qa.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class MorseCodeTranslator {
		
	Map<String, String> morseMap;
	
	public String translate(String morseCode) {
		
		morseMap = new HashMap<>();
		
		morseMap.put(".-", "a");
		morseMap.put("-...", "b");
		morseMap.put("-.-.", "c");
		morseMap.put("-..", "d");
		morseMap.put(".", "e");
		morseMap.put("..-.", "f");
		morseMap.put("--.", "g");
		morseMap.put("....", "h");
		morseMap.put("..", "i");
		morseMap.put(".---", "j");
		morseMap.put("-.-", "k");
		morseMap.put(".-..", "l");
		morseMap.put("--", "m");
		morseMap.put("-.", "n");
		morseMap.put("---", "o");
		morseMap.put(".--.", "p");
		morseMap.put("--.-", "q");
		morseMap.put(".-.", "r");
		morseMap.put("...", "s");
		morseMap.put("-", "t");
		morseMap.put("..-", "u");
		morseMap.put("...-", "v");
		morseMap.put(".--", "w");
		morseMap.put("-..-", "x");
		morseMap.put("-.--", "y");
		morseMap.put("--..", "z");
		morseMap.put("/", " ");
		
		String one = morseCode;
		
		int start = 0;
		
		for(int i = 0; i< one.length(); i++) {
			if(one.substring(i, i+1).equals(" ") || i == one.length() -1) {
				System.out.print(morseMap.get(one.substring(start, i)));
				start = i + 1;
			}
		
	}
	
		return morseCode;
	
		
		
	
	
			
		
	}
	
	
	
	
	
}
