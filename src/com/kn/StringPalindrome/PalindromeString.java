package com.kn.StringPalindrome;

public class PalindromeString {

	

	public static void reverse(char[] c) {

		int l = c.length-1;
		
		for(int i = 0; i< c.length; i++) {
			c[i] = c[l];
			l--;
		}
	}

}
