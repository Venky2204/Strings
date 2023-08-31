package com.kn.LargestWordInString;

public class FindLargest {

	public static String  findLargest(String[] srr) {
		int largest = srr[0].length();
		String largestString = " ";
		for (int i = 1; i < srr.length; i++) {
			if(srr[i].length() > largest) {
				largest = srr[i].length();
			}
		}
		for (int i = 0; i < srr.length; i++) {
			if(largest == srr[i].length()) {
				largestString =  srr[i];
			}
		}
		return largestString;
		
	}
	
}
