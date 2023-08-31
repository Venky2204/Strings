package com.kn.StringPalindrome;

import java.util.Scanner;


public class StringPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a  String");
		String s = scan.next();
		System.out.println("String Before reverse : "+s);
		char c[] = s.toCharArray();
		
		PalindromeString.reverse(c);
		String s2 = new String(c);
		System.out.println("String After Reverse : "+s2);
		if(s.equals(s2)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}
		scan.close();
	}

}

