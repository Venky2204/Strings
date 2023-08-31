package com.kn.Anagrams;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String 1");
		String string1 = scan.nextLine();
		System.out.println("Enter String 2");
		String string2 = scan.nextLine();
		boolean b = CheckAnagram.anagram(string1,string2);
		
		if(b == true) {
			System.out.println("ANAGRAMS");
		}else {
			System.out.println("NOT ANAGRAMS");
		}
		scan.close();
	}

}
