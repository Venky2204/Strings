package com.kn.CountEachCharacter;

import java.util.Scanner;

public class CountCharacter {

	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		String inputString = scan.nextLine();
		
		char crr[] = inputString.toCharArray();
		
		CountSequence.sortTheArray(crr);
		
		CountSequence.printCountSequence(crr);
		scan.close();
	}

}
