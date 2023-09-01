package com.kn.CountTypeOfCharacters;

public class Count {
	public int countConsonants(String s) {
		int upperCaseConsonants = 0;
		int lowerCaseConsonants = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				if (s.charAt(i) != 'A' && s.charAt(i) != 'E' && s.charAt(i) != 'I' && s.charAt(i) != 'O'
						&& s.charAt(i) != 'U') {
					upperCaseConsonants++;
				}
			}
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {

				if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o'
						&& s.charAt(i) != 'u') {
					lowerCaseConsonants++;
				}
			}
		}
		System.out.println("Consonants : " + (upperCaseConsonants + lowerCaseConsonants));
		System.out.println("UpperCase Consonants : " + upperCaseConsonants);
		System.out.println("LowerCase Consonants : " + lowerCaseConsonants);
		System.out.println("____________________________________________________");
		return (upperCaseConsonants + lowerCaseConsonants);
	}

	public int countNumbers(String s) {
		int numbers = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				numbers++;
			}
		}
		System.out.println("Numbers : " + numbers);
		System.out.println("____________________________________________________");
		return numbers;

	}

	public int countVowels(String s) {
		int upperCaseVowels = 0;
		int lowerCaseVowels = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
					|| s.charAt(i) == 'U') {
				upperCaseVowels++;
			}
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				lowerCaseVowels++;
			}
		} //
		System.out.println("Vowels : " + (upperCaseVowels + lowerCaseVowels));
		System.out.println("UpperCase Vowels : " + upperCaseVowels);
		System.out.println("LowerCase Vowels : " + lowerCaseVowels);
		System.out.println("____________________________________________________");
		return (upperCaseVowels + lowerCaseVowels);

	}

	public int countSpaces(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ' || s.charAt(i) == 32) {
				count++;
			}
		}
		System.out.println("Spaces : " + count);
		System.out.println("____________________________________________________");
		return count;

	}

	public void countSpecialCharacters(String s) {
		int speicalCharacters = s.length() - (countVowels(s) + countConsonants(s) + countNumbers(s) + countSpaces(s));
		System.out.println("Special Characters : " + speicalCharacters);
		System.out.println("____________________________________________________");
	}

}
