package com.kn.Duplicates;


public class RemoveDuplicates {

	public static StringBuffer removeDuplicates(String inputString) {

		// convert string to char array
		char crr2[] = inputString.toCharArray();
		
		//compare string with char array and remove duplicates in array
		for (int i = 0; i < crr2.length - 1; i++) {
			for (int j = i + 1; j < crr2.length; j++) {
				if (inputString.charAt(i) == crr2[j]) {
					crr2[j] = ' ';
				}
			}
		}
		//store remaining elements in new stringBuffer
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < crr2.length; i++) {
			if (crr2[i] != ' ') {
				s.append(crr2[i]);
			}
		}
		return s;
	}

}
