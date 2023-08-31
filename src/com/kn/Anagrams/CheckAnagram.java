package com.kn.Anagrams;

public class CheckAnagram {

	public static boolean anagram(String string1, String string2) {

		boolean b = true;

		// check length of the strings
		if (string1.length() != string2.length()) {
			return false;
		}

		// convert strings to char array
		char crr1[] = string1.toCharArray();
		char crr2[] = string2.toCharArray();

		// convert array elements in to UpperCase or LowerCase
		convertCase(crr1);
		convertCase(crr2);

		// sort the arrays
		sortArray(crr1);
		sortArray(crr2);

		// compare the array to check anagram or not
		for (int i = 0; i < crr2.length; i++) {
			if (crr1[i] == crr2[i]) {
				b = true;
			} else {
				b = false;
				return b;
			}
		}
		return b;

	}

	private static void sortArray(char[] crr) {

		// sort crr1
		char temp = 0;
		for (int i = 0; i < crr.length-2; i++) {
			int count = 0;
			for (int j = 0; j < crr.length - 1 - i; j++) {
				if (crr[j] > crr[j + 1]) {
					temp = crr[j];
					crr[j] = crr[j + 1];
					crr[j + 1] = temp;
					count = 1;
				}
			}
			if (count == 0) {
				break;
			}
		}
	}

	private static void convertCase(char[] crr) {

		for (int i = 0; i < crr.length; i++) {
			if (crr[i] >= 97 && crr[i] <= 122) {
				crr[i] -= 32;
			}
		}
	}

}
