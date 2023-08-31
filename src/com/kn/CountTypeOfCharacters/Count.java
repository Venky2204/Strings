package com.kn.CountTypeOfCharacters;

public class Count {
	static int countConsonants(String s) {
		int consonants = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				if (s.charAt(i) != 'A' && s.charAt(i) != 'E' && s.charAt(i) != 'I' && s.charAt(i) != 'O'
						&& s.charAt(i) != 'U') {
					consonants++;
				}
			}
		}
		return consonants;
	}

	static int countNumbers(String s) {
		int numbers = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				numbers++;
			}
		}
		return numbers;

	}

	static int countVowels(String s) {
		int vowels = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
					|| s.charAt(i) == 'U') {
				vowels++;
			}
		}
		return vowels;
	}

	
}
