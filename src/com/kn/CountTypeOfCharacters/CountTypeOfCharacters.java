package com.kn.CountTypeOfCharacters;

import java.util.Scanner;

public class CountTypeOfCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// char[] crr = s.toCharArray();
		String s1 = s.toUpperCase();
		int withoutSplCharacters = Count.countVowels(s1)+Count.countNumbers(s1)+Count.countConsonants(s1);
		int countSpCharacters = s1.length() - withoutSplCharacters;
		System.out.println("Vowels : "+Count.countVowels(s1));
		System.out.println("Consonants : "+Count.countConsonants(s1));
		System.out.println("Numbers : "+Count.countNumbers(s1));
		System.out.println("SpecialCharacters : "+countSpCharacters);
		
		scan.close();
	}

	

	}


