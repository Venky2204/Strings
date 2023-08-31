package com.kn.StringComparisions;

public class StringComparision6 {

	public static void main(String[] args) {
		//String s1 = new String("VENKY");
		//String s2 = "venky";
		String s3 = "VENKY";
		String s4 = s3;
		
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
