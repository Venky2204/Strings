package com.kn.CountEachCharacter;

public class CountSequence {

	public static void sortTheArray(char[] crr) {

		char temp = 0;
		for (int i = 0; i < crr.length - 2; i++) {
			for (int j = 0; j < crr.length - 1 - i; j++) {
				if (crr[j] > crr[j + 1]) {
					temp = crr[j];
					crr[j] = crr[j + 1];
					crr[j + 1] = temp;
				}
			}
		}
	}

	public static void printCountSequence(char[] crr) {

		int count = 0;
		char item = crr[0];
		for (int i = 0; i < crr.length; i++) {
			if (crr[i] == item) {
				count++;
			} else {
				System.out.println(item + " : " + count);//aaaabbbcc  //c
				item = crr[i];
				count = 0;
				i--;
			}
		}
		System.out.println(item + " : " + count);
	}

}
