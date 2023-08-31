package com.kn.StringComparisions;

public class StringComparision5 {

	public static void main(String[] args) {
		String s1 = new String("VENKY");
		String s2 = "venky";
		String s3 = s1 + s2;
		String s4 = s1 + s2;
		
		if(s3 == s4) {
			System.out.println("References equal");
		}else {
			System.out.println("References not equal");
		}
		if(s3.equals(s4)) {
			System.out.println("Content/Value equal");
		}else {
			System.out.println("Content/Value not equal");
		}
	}

}
