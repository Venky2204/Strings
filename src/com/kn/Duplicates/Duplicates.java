package com.kn.Duplicates;

import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {
		
		//create scanner object
		Scanner scan = new Scanner(System.in);
		
		//Taking input from keyboard
		String inputString = scan.nextLine();
		
		//calling method and print result
		System.out.println(RemoveDuplicates.removeDuplicates(inputString));
		
		//close the scanner object
		scan.close();
	}

}
