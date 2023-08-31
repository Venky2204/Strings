package com.kn.StringConcatMethods;

public class StringConcatination {

	public static void main(String[] args) {
		String s1 = "Venkatesh";
		String s2 = "Pothuraju";
		// concatenation method
		String byReferences = s1 + " " + s2;
		String byStrings = "Venkatesh" + " " + "Pothuraju";
		String byConcatMethod = s1.concat(" " + s2);
		System.out.println("s3 = " + byReferences);
		System.out.println("s4 = " + byStrings);
		System.out.println("s5 = " + byConcatMethod);

	}

}
