package com.kn.ReverseWithReserveSpaces;

public class StringReverse {

	public static void reverse(char[] inputArr, char[] revArr) {
		
		for (int i = 0; i < revArr.length; i++) {
			if (inputArr[i] == ' ') {
				revArr[i] = ' ';
			}
		}
		int j = revArr.length-1;
		for (int i = 0; i < revArr.length; i++) {
			if (inputArr[i] != ' ') {
				if (revArr[j] == ' ') {
					j--;
				}
				revArr[j] = inputArr[i];
				j--;
			}
		}
	}

}
