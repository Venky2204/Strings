package com.kn.CountTypeOfCharacters;

import java.util.Scanner;

public class CountTypeOfCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		Count c = new Count();
		
		System.out.println("====================================================");
		
//		c.countVowels(s);
//		c.countConsonants(s);
//		c.countNumbers(s);
//		c.countSpaces(s);
		c.countSpecialCharacters(s);
		
		scan.close();
	}

}
