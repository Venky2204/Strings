package com.kn.StringComparisions;

public class StringComparision3 {

	public static void main(String[] args) {
		String s1 = new String("VENKY");
		String s2 = "VENKY";
		
		if(s2 == s1) {
			System.out.println("References equal");
		}else {
			System.out.println("References not equal");
		}
		if(s1.equals(s2)) {
			System.out.println("Content/Value equal");
		}else {
			System.out.println("Content/Value not equal");
		}
		
	}

}
