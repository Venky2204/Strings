package com.kn.ReverseWithReserveSpaces;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		char inputArr[] = s.toCharArray();
		
		char revArr[] = new char[s.length()];
		
		StringReverse.reverse(inputArr,revArr);
		
		
		for (char c : revArr) {
			System.out.print(c);
		}
		scan.close();

	}

}
