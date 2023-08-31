package com.kn.StringComparisions;

public class StringComparision1 {

	public static void main(String[] args) {
		String s1 = "VENKY";
		String s2 = "VENKY";
		
		if(s1 == s2) {
			System.out.println("References equal");
		}else {
			System.out.println("References not equal");
		}
		if(s1.equals(s2)) {
			System.out.println("Content/Value equal with Case Sensitivity");
		}else {
			System.out.println("Content/Value not equal with Case Sensitivity");
		}
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Content/Value equal with Ignore Case Sensitivity");
		}else {
			System.out.println("Content/Value not equal with Ignore Case Sensitivity");
		}
		

	}

}
