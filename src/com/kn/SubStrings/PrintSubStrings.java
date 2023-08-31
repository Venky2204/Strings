package com.kn.SubStrings;

public class PrintSubStrings {

	public static void subStrings(String input) {
		
		System.out.println("Posibilities : ");
		
		for (int i = 0; i < input.length(); i++) {
			String temp = " ";
			for (int j = i; j < input.length(); j++) {
				temp = temp + input.charAt(j);
				System.out.print(temp+" ");
			}
		}
	}

}
