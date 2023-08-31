package com.kn.Unicode;

public class ToUpperCase {

	public static StringBuffer toUpperCase(String s) {
		char first = s.charAt(0);
		
		if (first >= 97 && first <= 122) {
			first = (char) (first - 32);
		}
		StringBuffer remaining = new StringBuffer();
		remaining.append(first);
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				remaining.append((char)(s.charAt(i) + 32));
			} else {
				remaining.append(s.charAt(i));
			}
		}
		return remaining;
	}
}
