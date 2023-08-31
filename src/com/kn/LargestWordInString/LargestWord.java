package com.kn.LargestWordInString;

import java.util.Scanner;

public class LargestWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String srr[] = s.split(" ");
		System.out.print("Largest word : "+FindLargest.findLargest(srr));
		
		scan.close();
		
	}

	

}
