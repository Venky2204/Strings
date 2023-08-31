package com.kn.SubStrings;

import java.util.Scanner;

public class SubStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		PrintSubStrings.subStrings(input);
		scan.close();
	}

}
