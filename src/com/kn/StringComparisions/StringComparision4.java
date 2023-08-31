package com.kn.StringComparisions;

public class StringComparision4 {

	public static void main(String[] args) {
		String s3 = "VENKY" + "venky";
		String s4 = "VENKY" + "venky";
		
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
