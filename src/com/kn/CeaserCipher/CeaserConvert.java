package com.kn.CeaserCipher;


public class CeaserConvert {

	public static String encryptKey(String inputString, int key) {

		char[] crr = inputString.toCharArray();

		for (int i = 0; i < crr.length; i++) {
			// convert UpperCase
			if (crr[i] >= 65 && crr[i] <= 90) {
				if (crr[i] + key <= 90) {
					crr[i] = (char) (crr[i] + key);
				} else {
					crr[i] = (char) ((crr[i] - 26) + key);
				}
			}
			// convert LowerCase
			else if (crr[i] >= 97 && crr[i] <= 122) {
				if (crr[i] + key <= 122) {
					crr[i] = (char) (crr[i] + key);
				} else {
					crr[i] = (char) ((crr[i] - 26) + key);
				}
			}
			// convert numbers
			else if (crr[i] >= 48 && crr[i] <= 57) {
				if (crr[i] + key <= 57) {
					crr[i] = (char) (crr[i] + key);
				} else {
					crr[i] = (char) ((crr[i] - 9) + key);
				}
			}

		}

		String s = new String(crr);
		return s;
	}

}
