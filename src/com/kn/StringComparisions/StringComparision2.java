package com.kn.StringComparisions;

public class StringComparision2 {

	public static void main(String[] args) {
		String s1 = new String("VENKY");
		String s2 = new String("VENKY");
		
		if(s1 == s2) {
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
